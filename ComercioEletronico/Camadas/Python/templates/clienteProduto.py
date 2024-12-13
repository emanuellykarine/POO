import streamlit as st
import pandas as pd
from view.views import View
import time

class ClienteProdutoUI:
    @staticmethod
    def produto_inserir():
        st.header("Inserir produto no carrinho")
        produtos = View.produto_listar()
        if len(produtos) == 0:
            st.write("Não tem produtos.")
        else:
            produto = st.selectbox("Selecione o produto", produtos)
            quantidade = st.number_input("Informe a quantidade", value = 0, step = 1)

            if st.button("Adicionar produto no carrinho"):
                if quantidade > produto.get_estoque():
                    st.error("Quantidade acima do disponível")
                else:
                    for venda in View.venda_listar():
                        if venda.get_id_cliente() == st.session_state["cliente_id"] and venda.get_carrinho() == False:
                            View.venda_item_inserir(quantidade, produto.get_preco(), venda.get_id(), produto.get_descricao())
                            View.produto_atualizar(produto.get_id(), produto.get_descricao(), produto.get_preco(), produto.get_estoque() - quantidade, produto.get_id_categoria())
                            View.venda_atualizar(venda.get_id(), venda.get_data(), venda.get_carrinho(), venda.get_total() + (produto.get_preco() * quantidade), venda.get_id_cliente())
                            st.success("Produto adicionado no carrinho")
                            time.sleep(2)
                            st.rerun()

    @staticmethod
    def produto_listar():
        st.header("Produtos disponíveis")
        produtos = View.produto_listar()
        if len(produtos) == 0:
            st.write("Nenhum produto cadastrado")
        else:
            dic = []
            for obj in produtos: dic.append(obj.__dict__)
            df = pd.DataFrame(dic)

            df.rename(columns={
                '_Produto__id': "ID",
                '_Produto__descricao':'Descrição',
                '_Produto__preco': 'Preço (R$)',
                '_Produto__estoque': 'Estoque',
                '_Produto__id_categoria': 'Categoria'
            }, inplace=True)
            st.dataframe(df)

    @staticmethod
    def comprar():
        st.header("Finalizar pedido")
        ClienteProdutoUI.pedido_visualizar()
        if st.button("Finalizar compra"):
            View.venda_confirmar(st.session_state["cliente_id"])
            st.success("Compra finalizada")
            time.sleep(2)
            st.rerun()

    @staticmethod
    def pedido_visualizar():
        st.header("Carrinho")
        pedido = View.venda_item_listar()
        if len(pedido) == 0:
            st.write("Nenhum pedido cadastrado")
        else:
            dic = []
            for venda in View.venda_listar():
                if venda.get_id_cliente() == st.session_state["cliente_id"] and venda.get_carrinho() == False:
                    id_venda = venda.get_id()

            for obj in pedido: 
                if obj.get_id_venda() == id_venda:
                    dic.append(obj.__dict__)
                
            df = pd.DataFrame(dic)

            df.rename(columns={
                '_Venda_item__id': "ID",
                '_Venda_item__qtd':'Quantidade',
                 '_Venda_item__preco': 'Item preco (R$)',
                '_Venda_item__id_venda': 'ID venda',
                '_Venda_item__id_produto': 'Produto'
            }, inplace=True)
            st.dataframe(df)

                
    