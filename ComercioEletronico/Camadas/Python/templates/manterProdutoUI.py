import streamlit as st
import pandas as pd
from views import View
import time

class ManterProdutoUI:
    @staticmethod
    def main():
        st.header("Cadastro de produtos")
        tab1, tab2, tab3, tab4 = st.tabs(["Listar", "Inserir", "Atualizar", "Excluir"])

        with tab1:
            ManterProdutoUI.produto_listar()
        with tab2:
            ManterProdutoUI.produto_inserir()
        with tab3:
            ManterProdutoUI.produto_atualizar()
        with tab4:
            ManterProdutoUI.produto_excluir()
        

    @classmethod 
    def produto_inserir(cls):
        descricao = st.text_input("Informe a descricao")
        preco = st.text_input("Informe o preço")
        estoque = st.text_input("Informe o estoque")

        if st.button("Inserir"):
            View.produto_inserir(descricao, preco, estoque)
            st.success("Produto adicionado")
            time.sleep(2)
            st.rerun()

    @classmethod 
    def produto_listar(cls):
        produtos = View.produto_listar()
        if len(produtos) == 0:
            st.write("Nenhum produto cadastrado")
        else:
            dic = []
            for obj in produtos: dic.append(obj.__dict__)
            df = pd.DataFrame(dic)
            st.dataframe(df)

    @classmethod 
    def produto_atualizar(cls):
        produtos = View.produto_listar()
        if len(produtos) == 0:
            st.write("Nenhum produto cadastrado")
        else:
            selecionado = st.selectbox("Atualização de produtos", produtos)

            descricao = st.text_input("Informe a nova descricao", selecionado.get_descricao())
            preco = st.text_input("Informe o novo preço", selecionado.get_preco())
            estoque = st.text_input("Informe o novo estoque", selecionado.get_estoque())

            if st.button("Atualizar"):
                View.produto_atualizar(selecionado.get_id(), descricao, preco, estoque)
                st.success("Produto atualizado")
                time.sleep(2)
                st.rerun()

    @classmethod 
    def produto_excluir(cls):
        produtos = View.produto_listar()
        if (len(produtos) == 0):
            st.write("Nenhum produto cadastrado")
        else:
            selecionado = st.selectbox("Exclusão de produto", produtos)
       
            if st.button("Excluir"):
                View.produto_excluir(selecionado.get_id())
                st.success("produto excluído")
                time.sleep(2)
                st.rerun()