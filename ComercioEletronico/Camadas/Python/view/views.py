from models.cliente import Cliente, Clientes
from models.categoria import Categoria, Categorias
from models.produto import Produto, Produtos
from models.venda import Venda, Vendas
from models.vendaItem import Venda_item, Venda_itens

class View:
    @staticmethod
    def cliente_admin():
        clientes = Clientes.listar()
        for cliente in clientes:
            if cliente.get_email() == "admin@gmail.com": return None
        View.cliente_inserir("admin", "admin@gmail.com", "0000", "1234")
    
    @staticmethod
    def cliente_autenticar(email, senha):
        clientes = Clientes.listar()
        for cliente in clientes:
            if cliente.get_email() == email and cliente.get_senha() == senha:
                return {"id": cliente.get_id(), "nome": cliente.get_nome()}
        return None
    
    @staticmethod
    def cliente_listar():
        return Clientes.listar()
    @staticmethod
    def cliente_inserir(nome, email, fone, senha):
        clientes = Clientes.listar()
        for cliente in clientes:
            if email == cliente.get_email():
                raise ValueError("Email já cadastrado")
        c = Cliente(0, nome, email, fone, senha)
        Clientes.inserir(c)
    @staticmethod
    def cliente_atualizar(id, nome, email, fone, senha):
        clientes = Clientes.listar()
        for cliente in clientes:
            if email == cliente.get_email():
                raise ValueError("Email já cadastrado")
        c = Cliente(id, nome, email, fone, senha)
        Clientes.atualizar(c)
    @staticmethod
    def cliente_excluir(id):
        c = Cliente(id, "", "", "", "")
        Clientes.excluir(c)


    @staticmethod
    def categoria_listar():
        return Categorias.listar()
    @staticmethod
    def categoria_listar_id(id):
        return Categorias.listar_id(id)
    @staticmethod
    def categoria_inserir(descricao):
        c = Categoria(0, descricao)
        Categorias.inserir(c)
    @staticmethod
    def categoria_atualizar(id, descricao):
        c = Categoria(id, descricao)
        Categorias.atualizar(c)
    @staticmethod
    def categoria_excluir(id):
        c = Categoria(id, "")
        Categorias.excluir(c)

    @staticmethod
    def produto_listar():
        return Produtos.listar()
    @staticmethod
    def produto_inserir(descricao, preco, estoque, id_categoria):
        p = Produto(0, descricao, preco, estoque, id_categoria)
        Produtos.inserir(p)
    @staticmethod
    def produto_atualizar(id, descricao, preco, estoque, id_categoria):
        p = Produto(id, descricao, preco, estoque, id_categoria)
        Produtos.atualizar(p)
    @staticmethod
    def produto_excluir(id):
        p = Produto(id, "", 0, 0, None)
        Produtos.excluir(p)
    @staticmethod
    def produto_reajustar(percentual):
        for obj in View.produto_listar():
            View.produto_atualizar(obj.get_id(), obj.get_descricao(), obj.get_preco() * (1 + percentual), obj.get_estoque())
        
    @classmethod
    def venda_inserir(cls, obj):
        v = Venda(obj)
        Vendas.inserir(v)
    @classmethod
    def venda_listar(cls):
        return Vendas.listar()
    @classmethod
    def venda_listar_id(cls, id):
        return Vendas.listar_id(id)
    @staticmethod
    def venda_inserir(data, carrinho, total, id_cliente):
        v = Venda(0, data, carrinho, total, id_cliente)
        Vendas.inserir(v)
    @staticmethod
    def venda_atualizar(id, data, carrinho, total, id_cliente):
        v = Venda(id, data, carrinho, total, id_cliente)
        Vendas.atualizar(v)
    @staticmethod
    def venda_excluir(id):
        v = Venda(id, "", "", "", "")
        Vendas.excluir(v)
    
    @classmethod
    def venda_item_inserir(cls, obj):
        v = Venda_item(obj)
        Venda_itens.inserir(v)
    @classmethod
    def venda_item_listar(cls):
        return Venda_itens.listar()
    @classmethod
    def venda_item_listar_id(cls, id):
        return Venda_itens.listar_id(id)
    @staticmethod
    def venda_item_inserir(q, p, id_venda, id_produto):
        v = Venda_item(0, q, p, id_venda, id_produto)
        Venda_itens.inserir(v)
    @staticmethod
    def venda_item_atualizar(id, q, p, id_venda, id_produto):
        v = Venda_item(id, q, p, id_venda, id_produto)
        Venda_itens.atualizar(v)
    @staticmethod
    def venda_item_excluir(id):
        v = Venda_item(id, "", "", "", "")
        Venda_itens.excluir(v)

    