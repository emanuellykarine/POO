import streamlit as st
import pandas as pd
from views import View
import os
import json

class ManterClienteUI:
    @staticmethod
    def main():
        st.header("Cadastro de Clientes")
        tab1, tab2, tab3, tab4 = st.tabs(["Listar", "Inserir", "Atualizar", "Excluir"])

        with tab1:
            ManterClienteUI.cliente_listar()
        with tab2:
            ManterClienteUI.cliente_inserir()
        with tab3:
            ManterClienteUI.cliente_atualizar()
        with tab4:
            ManterClienteUI.cliente_excluir()
        

    @classmethod 
    def cliente_inserir(cls):
        nome = st.text_input("Informe o nome")
        email = st.text_input("Informe o e-mail")
        fone = st.text_input("Informe o fone")

        if st.button("Inserir"):
            View.cliente_inserir(nome, email, fone)
            st.success("Cliente adicionado")

    @classmethod 
    def cliente_listar(cls):
        json_caminho = "clientes.json"
        if os.path.exists(json_caminho):
            df = pd.read_json("clientes.json")
        else:
            df = pd.DataFrame()

        st.dataframe(df)

    @classmethod 
    def cliente_atualizar(cls):
        with open("clientes.json", 'r') as f:
            data = json.load(f)

        opcoes = [(cliente['id'], cliente['nome'], cliente['email'], cliente['fone']) for cliente in data]
        selecionado = st.selectbox("Atualização de clientes", opcoes, format_func=lambda x: f"{x[0]} - {x[1]} - {x[2]} - {x[3]}")

        id = selecionado[0]

        nome = st.text_input("Informe o novo nome")
        email = st.text_input("Informe o novo e-mail")
        fone = st.text_input("Informe o novo fone")

        if st.button("Atualizar"):
            View.cliente_atualizar(id, nome, email, fone)
            st.success("Cliente atualizado")

    @classmethod 
    def cliente_excluir(cls):
        with open("clientes.json", 'r') as f:
            data = json.load(f)

        opcoes = [(cliente['id'], cliente['nome'], cliente['email'], cliente['fone']) for cliente in data]
        selecionado = st.selectbox("Exclusão de clientes", opcoes, format_func=lambda x: f"{x[0]} - {x[1]} - {x[2]} - {x[3]}")
       
        id = selecionado[0]

        if st.button("Excluir"):
            View.cliente_excluir(id)
            st.success("Cliente excluído")