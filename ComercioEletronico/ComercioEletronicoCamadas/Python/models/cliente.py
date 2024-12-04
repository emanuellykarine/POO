import json

class Cliente:
    def __init__(self, id, nome, email, fone): #atributo de instancia
        self.set_id(id)
        self.set_nome(nome)
        self.set_email(email)
        self.set_fone(fone)
    
    def set_id(self, id):
        self.__id = id

    def set_nome(self, n):
        self.__nome = n
    
    def set_email(self, e):
        self.__email = e
    
    def set_fone(self, f):
        self.__fone = f

    def get_nome(self):
        return self.__nome

    def get_email(self):
        return self.__email
    
    def get_fone(self):
        return self.__fone
    
    def __str__(self):
        return f"{self.__id} - {self.__nome} - {self.__email} - {self.__fone}"
    
class Clientes:
    objetos = [] #atributos de classe cls - forma de acessar o atributo da classe 

    @classmethod
    def inserir(cls, obj):
        cls.abrir()
        
        #calcular o id do objeto
        id = 0
        for cliente in cls.objetos:
            if cliente.id > id: id = cliente.id
        obj.id = id + 1

        cls.objetos.append(obj)
        cls.salvar()

    @classmethod
    def listar(cls):
        cls.abrir()
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
    def atualizar(cls, obj):
        cls.abrir()
        cliente_atualizar= None
        for cliente in cls.objetos:
            if cliente.id == obj.id:
                cliente_atualizar = cliente
                
        if cliente_atualizar:
            cliente.nome = obj.nome
            cliente.email = obj.email
            cliente.fone = obj.fone
        else:
            print("Cliente não existe")
        cls.salvar()

    @classmethod
    def excluir(cls, id):
        cls.abrir()
        cliente_excluir = None
        for cliente in cls.objetos:
            if cliente.id == id:
                cliente_excluir = cliente
                
        if cliente_excluir:
            cls.objetos.remove(cliente_excluir)
            print("Cliente removido")
        else:
            print("Cliente não existe")
        cls.salvar()

    @classmethod
    def salvar(cls):
        with open("clientes.json", mode="w") as arquivo:
            json.dump(cls.objetos, arquivo, default = vars) #vars - converte um objeto em dicionario
            #dump - pega a lista de obejtos e salva no arquivo
            
    @classmethod
    def abrir(cls):
        cls.objetos = []
        try:
            with open("clientes.json", mode="r") as arquivo:
                clientes_json = json.load(arquivo)
                for obj in clientes_json:
                    c = Cliente(obj["id"], obj["nome"], obj["email"], obj["fone"])
                    cls.objetos.append(c)    
        except FileNotFoundError:
            pass