import streamlit as st
import pandas as pd
from view.views import View
import time

class ClienteProdutoUI:
    @classmethod 
    def produto_inserir(cls):
        produtos = View.produto_listar()
        if len(produtos) == 0:
            st.write("Não tem produtos.")
        else:
            produto = st.selectbox("Selecione o produto", produtos)

        if st.button("Adicionar produto no carrinho"):
            View.venda_inserir(produto)
            st.success("Produto adicionado")
            time.sleep(2)
            st.rerun()

    def produto_excluir(cls):
        produtos = View.produto_listar()
        if len(produtos) == 0:
            st.write("Não tem produtos.")
        else:
            produto = st.selectbox("Selecione o produto", produtos)
        
        if st.button("Adicionar produto no carrinho"):
            View.venda_item_excluir(produto)
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
    def comprar():
        ClienteProdutoUI.pedido_visualizar()
        # if st.button("Finalizar compra"):
        #     View.venda_inserir()

    @classmethod 
    def pedido_visualizar(cls):
        pedido = View.venda_listar()
        if len(pedido) == 0:
            st.write("Nenhum pedido cadastrado")
        else:
            dic = []
            for obj in pedido: dic.append(obj.__dict__)
            df = pd.DataFrame(dic)
            st.dataframe(df)
    