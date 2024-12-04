import json

class Venda_item:
    def __init__(self, id, q, p):
        self.set_id(id)
        self.set_qtd(q)
        self.set_preco(p)

    def set_id(self, id):
        self.__id = id

    def set_qtd(self, q):
        self.__qtd = q
    
    def set_preco(self, p):
        self.__preco = p

    def set_idVenda(self, idVenda):
        self.__idVenda = idVenda

    def set_idProduto(self, idproduto):
        self.__idProduto = idproduto

    def get_id(self):
        return self.__id
    
    def get_qtd(self):
        return self.__qtd

    def get_preco(self):
        return self.__preco
    
    def get_idVenda(self):
        return self.__idVenda

    def get_idProduto(self):
        return self.__idProduto
    
    def __str__(self):
        return f"{self.__id} - {self.__qtd} - {self.__preco} - {self.__idVenda} - {self.__idProduto}"