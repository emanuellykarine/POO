import streamlit as st
import pandas as pd
from view.views import View
import time

class ReajustarProduto:
    def main():
        produtos = View.produto_listar()
        if len(produtos) == 0:
            st.write("Nenhum produto cadastrado")
        else:
            selecionado = st.selectbox("Reajuste de preço de produtos", produtos)

            porcentagem = st.text_input("Informe a porcentagem do reajuste")

            if st.button("Reajustar"):
                View.produto_reajustar(selecionado.get_id(), selecionado.get_descricao(), porcentagem, selecionado.get_estoque())
                st.success("Produto com valor reajustado")
                time.sleep(2)
                st.rerun()