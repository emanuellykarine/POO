import json

class Categoria:
    def __init__(self, id, d):
        self.set_id(id)
        self.set_descricao(d)
        
    def set_id(self, id):
        self.__id = id
    
    def set_descricao(self, d):
        self.__d = d

    def get_id(self):
        return self.__id

    def get_descricao(self):
        return self.__d

    def __str__(self):
        return f"{self.__id} - {self.__d}"