import streamlit as st
from ComercioEletronico.Camadas.Python.templates.manterClienteUI import ManterClienteUI
from ComercioEletronico.Camadas.Python.templates.manterCategoriaUI import ManterCategoriaUI
class indexUI:
    def main():
        op = st.sidebar.selectbox("Menu", ["Cliente", "Categoria", "Produto"])
        if op == "Cliente": ManterClienteUI.main()
        if op == "Categoria": ManterCategoriaUI.main()

indexUI.main()
