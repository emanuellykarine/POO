import streamlit as st
from view.views import View 
import time

class LoginUI:
    def main():
        st.header("Entrar no sistema")
        email = st.text_input("Informe e-mail")
        senha = st.text_input("Informe a senha", type="password")

        if st.button("Entrar"):
            cliente = View.cliente_autenticar(email, senha)
            if cliente == None:
                st.write("E-mail ou senha inválidos")
            else:
                st.session_state["cliente_id"] = cliente["id"]
                st.session_state["cliente_nome"] = cliente["nome"]
                time.sleep(2)
                st.rerun()