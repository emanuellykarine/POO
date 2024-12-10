import json

class Venda:
    def __init__(self, id):
        self.set_id(id)

    def set_id(self, id):
        self.__id = id
    
    def set_data(self, data):
        self.__data = data

    def set_carrinho(self, carrinho):
        self.__carrinho = carrinho
    
    def set_total(self, total):
        self.__total = total
    
    def set_idCliente(self, idCliente):
        self.__idCliente = idCliente

    def get_id(self):
        return self.__id

    def get_data(self):
        return self.__data

    def get_carrinho(self):
        return self.__carrinho

    def get_total(self):
        return self.__total
    
    def get_idCliente(self):
        return self.__idCliente

    def __str__(self):
        return f"{self.get_id()} - {self.get_data()} - {self.get_carrinho()} - {self.get_total()} - {self.get_idCliente()}"
    
class Vendas:
    objetos = []

    @classmethod
    def inserir(cls, obj):
        cls.objetos.append(obj)

    @classmethod
    def listar(cls):
        return cls.objetos
    
    @classmethod
    def listar_id(cls, id):
        venda_listar= None
        for venda in cls.objetos:
            if venda.get_id() == id:
                venda_listar = venda
                
        if venda_listar:
            return venda_listar
        else:
            print("Venda não cadastrada")
