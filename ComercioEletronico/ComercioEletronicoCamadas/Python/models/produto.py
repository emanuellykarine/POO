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
    
class Produtos:
    objetos = [] #atributos de classe cls - forma de acessar o atributo da classe 

    @classmethod
    def inserir(cls, obj):
        cls.abrir()
        
        #calcular o id do objeto
        id = 0
        for produto in cls.objetos:
            if produto.id > id: id = produto.id
        obj.id = id + 1

        cls.objetos.append(obj)
        cls.salvar()

    @classmethod
    def listar(cls):
        cls.abrir()
        return cls.objetos
    
    @classmethod
    def listar_id(cls, id):
        produto_listar= None
        for produto in cls.objetos:
            if produto.id == id:
                produto_listar = produto
                
        if produto_listar:
            return produto_listar
        else:
            print("Produtonão existe")

    @classmethod
    def atualizar(cls, obj):
        cls.abrir()
        produto_atualizar= None
        for produto in cls.objetos:
            if produto.id == obj.id:
                produto_atualizar = produto
                
        if produto_atualizar:
            produto.nome = obj.nome
            produto.email = obj.email
            produto.fone = obj.fone
        else:
            print("produto não existe")
        cls.salvar()

    @classmethod
    def excluir(cls, id):
        cls.abrir()
        produto_excluir = None
        for produto in cls.objetos:
            if produto.id == id:
                produto_excluir = produto
                
        if produto_excluir:
            cls.objetos.remove(produto_excluir)
            print("produto removido")
        else:
            print("produto não existe")
        cls.salvar()

    @classmethod
    def salvar(cls):
        with open("produtos.json", mode="w") as arquivo:
            json.dump(cls.objetos, arquivo, default = vars) #vars - converte um objeto em dicionario
            #dump - pega a lista de obejtos e salva no arquivo
            
    @classmethod
    def abrir(cls):
        cls.objetos = []
        try:
            with open("produtos.json", mode="r") as arquivo:
                produtos_json = json.load(arquivo)
                for obj in produtos_json:
                    c = Produto(obj["id"], obj["descricao"], obj["preco"], obj["estoque"], obj["id_categoria"])
                    cls.objetos.append(c)    
        except FileNotFoundError:
            pass