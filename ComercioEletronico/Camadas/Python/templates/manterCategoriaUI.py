import streamlit as st
import pandas as pd
from views import View
import time

class ManterCategoriaUI:
    @staticmethod
    def main():
        st.header("Cadastro de categoria")
        tab1, tab2, tab3, tab4 = st.tabs(["Listar", "Inserir", "Atualizar", "Excluir"])

        with tab1:
            ManterCategoriaUI.categoria_listar()
        with tab2:
            ManterCategoriaUI.categoria_inserir()
        with tab3:
            ManterCategoriaUI.categoria_atualizar()
        with tab4:
            ManterCategoriaUI.categoria_excluir()
        

    @classmethod 
    def categoria_inserir(cls):
        descricao = st.text_input("Informe a descricao da categoria")

        if st.button("Inserir"):
            View.categoria_inserir(descricao)
            st.success("Categoria adicionada")
            time.sleep(2)
            st.rerun()

    @classmethod 
    def categoria_listar(cls):
        categorias = View.categoria_listar()
        if len(categorias) == 0:
            st.write("Nenhuma categoria cadastrada")
        else:
            dic = []
            for obj in categorias: dic.append(obj.__dict__)
            df = pd.DataFrame(dic)
            st.dataframe(df)

    @classmethod 
    def categoria_atualizar(cls):
        categorias = View.categoria_listar()
        if len(categorias) == 0:
            st.write("Nenhuma categoria cadastrada")
        else:
            selecionado = st.selectbox("Atualização de categorias", categorias)

            descricao = st.text_input("Informe a nova descrição", selecionado.get_descricao())

            if st.button("Atualizar"):
                View.categoria_atualizar(selecionado.get_id(), descricao)
                st.success("Categoria atualizada")
                time.sleep(2)
                st.rerun()

    @classmethod 
    def categoria_excluir(cls):
        categorias = View.categoria_listar()
        if (len(categorias) == 0):
            st.write("Nenhuma categoria cadastrada")
        else:
            selecionado = st.selectbox("Exclusão de categoria", categorias)
       
            if st.button("Excluir"):
                View.categoria_excluir(selecionado.get_id())
                st.success("Categoria excluída")
                time.sleep(2)
                st.rerun()