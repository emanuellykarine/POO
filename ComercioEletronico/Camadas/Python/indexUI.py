import streamlit as st
from templates.manterClienteUI import ManterClienteUI
from templates.manterProdutoUI import ManterProdutoUI
from templates.manterCategoriaUI import ManterCategoriaUI
from templates.abrirContaUI import AbrirContaUI
from templates.loginUI import LoginUI
from view.views import View

class IndexUI:
    def menu_visitante():
        op = st.sidebar.selectbox("Menu", ["Entrar no sistema", "Abrir conta"])
        if op == "Entrar no sistema": LoginUI.main()
        if op == "Abrir conta": AbrirContaUI.main()

    def menu_admin():
        op = st.sidebar.selectbox("Menu", ["Cadastro de clientes", "Cadastro de categoria", "Cadastro de produtos", "Visualizar pedidos"])
        if op == "Cadastro de clientes": ManterClienteUI()
        if op == "Cadastro de categoria": ManterCategoriaUI()
        if op == "Cadastro de produtos": ManterProdutoUI()
    
    def menu_cliente():
        op = st.sidebar.selectbox("Menu", ["Listar produtos", "Colocar produto no carrinho", "Comprar carrinho", "Ver meus pedidos"])
        if op == "Listar produtos": View.produto_listar()
        if op == "Inserir produto no carrinho": View.produto_inserir()
        if op == "Comprar carrinho": View.venda_inserir()
        if op == "Ver meus pedidos":View.venda_listar()
    
    def sair_do_sistema():
        if st.sidebar.button("Sair"):
            del st.session_state["cliente_id"]
            del st.session_state["cliente_nome"]
            st.rerun()

    def sidebar():
        if "cliente_id" not in st.session_state:
            IndexUI.menu_visitante()
        else:
            admin = st.session_state["cliente_nome"] == "admin"

            st.sidebar.write("Bem-vindo(a), "+ st.session_state["cliente_nome"])

            if admin:IndexUI.menu_admin()
            else:IndexUI.menu_cliente()

            IndexUI.sair_do_sistema()

    def main():
        View.cliente_admin()
        IndexUI.sidebar()

IndexUI.main()
