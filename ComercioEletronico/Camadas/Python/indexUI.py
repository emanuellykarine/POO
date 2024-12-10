import streamlit as st
from manterClienteUI import ManterClienteUI

class indexUI:
    def main():
        op = st.sidebar.selectbox("Menu", ["Cliente", "Outra"])
        if op == "Cliente": ManterClienteUI.main()

indexUI.main()
