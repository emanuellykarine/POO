import json

class Produto:
    def __init__(self, id, d, p, e):
        self.set_id(id)
        self.set_descricao(d)
        self.set_preco(p)
        self.set_estoque(e)

    def set_id(self, id):
        self.__id = id
    
    def set_descricao(self, d):
        self.__descricao = d
    
    def set_preco(self, p):
        self.__preco = p

    def set_estoque(self, e):
        self.__estoque = e
    
    def set_idCategoria(self, idCategoria):
        self.__idCategoria = idCategoria

    def get_id(self):
        return self.__id
    
    def set_descricao(self):
        return self.__descricao
    
    def set_preco(self):
        return self.__preco

    def set_estoque(self):
        return self.__estoque
    
    def set_idCategoria(self):
        return self.__idCategoria
    
    def __str__(self):
        return f"{self.__id} - {self.__descricao} - {self.__preco} - {self.__estoque} - {self.__idCategoria}"