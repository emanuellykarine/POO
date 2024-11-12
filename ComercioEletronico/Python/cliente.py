import json

class Cliente:
    def __init__(self, id, nome, email, fone):
        self.set_id(id)
        self.set_nome(nome)
        self.set_email(email)
        self.set_fone(fone)
    
    def set_id(self, id):
        self.id = id

    def set_nome(self, n):
        self.nome = n
    
    def set_email(self, e):
        self.email = e
    
    def set_fone(self, f):
        self.fone = f

    def get_nome(self):
        return self.nome

    def get_email(self):
        return self.email
    
    def get_fone(self):
        return self.fone
    
    def __str__(self):
        return f"{self.id} - {self.nome} - {self.email} - {self.fone}"
    
class Clientes:
    objetos = []

    @classmethod
    def inserir(cls, obj):
        cls.objetos.append(obj)

    @classmethod
    def listar(cls):
        return cls.objetos
    
    @classmethod
    def listar_id(cls, id):
        cliente_listar= None
        for cliente in cls.objetos:
            if cliente.id == id:
                cliente_listar = cliente
                
        if cliente_listar:
            return cliente_listar
        else:
            print("Cliente não existe")

    @classmethod
    def atualizar(cls, id):
        cliente_atualizar= None
        for cliente in cls.objetos:
            if cliente.id == id:
                cliente_atualizar = cliente
                
        if cliente_atualizar:
            email = input("Alterar email: ")
            fone = input("Alterar telefone: ")
            cliente_atualizar = Cliente(id, cliente.nome, email, fone)
        else:
            print("Cliente não existe")

    @classmethod
    def excluir(cls, id):
        cliente_excluir = None
        for cliente in cls.objetos:
            if cliente.id == id:
                cliente_excluir = cliente
                
        if cliente_excluir:
            cls.objetos.remove(cliente_excluir)
            print("Cliente removido")
        else:
            print("Cliente não existe")

    @classmethod
    def salvar(cls):
        with open("clientes.json", mode="w") as arquivo:
            json.dump(cls.objetos, arquivo, default = vars)

    @classmethod
    def abrir(cls):
        cls.objetos = []
        with open("clientes.json", mode="r") as arquivo:
            clientes_json = json.load(arquivo)
            for obj in clientes_json:
                c = Cliente(obj["id"], obj["nome"], obj["email"], obj["fone"])
                cls.objetos.append(c)    