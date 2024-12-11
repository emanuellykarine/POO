import streamlit as st
from templates.manterClienteUI import ManterClienteUI
from templates.manterCategoriaUI import ManterCategoriaUI
from views import View
class indexUI:
    def main():
        op = st.sidebar.selectbox("Menu", ["Cliente", "Categoria", "Produto"])
        if op == "Cliente": ManterClienteUI.main()
        if op == "Categoria": ManterCategoriaUI.main()

indexUI.main()
