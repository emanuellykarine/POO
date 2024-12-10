from cliente import Cliente, Clientes

class UI:
    def menu():
        print("1 - Listar \n2 - Inserir \n3 - Atualizar \n4 - Excluir \n9 - Finalizar programa")
        return int(input("Informe uma opção: "))
    
    def main():
        op = 0
        while op != 9:
            op = UI.menu()
            if op == 1: UI.listar_clientes()
            if op == 2: UI.inserir_cliente()
            if op == 3: UI.atualizar_cliente()
            if op == 4: UI.excluir_cliente()
            if op == 9: print("Programa finalizado")

    @classmethod
    def excluir_cliente(cls):
        id = int(input("Informe o id do cliente que deseja excluir: "))
        cliente = Cliente(id, "", "", "")
        Clientes.excluir(cliente)

    @classmethod 
    def inserir_cliente(cls):
        nome = input("Informe o nome: ")
        email = input("Informe o email: ")
        fone = input("Informe o fone: ")
        cliente = Cliente(0, nome, email, fone)
        Clientes.inserir(cliente)

    @classmethod
    def atualizar_cliente(cls):
        cls.listar_clientes()
        id = int(input("Qual o id do cliente que você deseja alterar os dados: "))
        nome = input("Novo nome: ")
        email = input("Novo email: ")
        fone = input("Novo telefone: ")
        cliente = Cliente(id, nome, email, fone)
        Clientes.atualizar(cliente)

    @classmethod 
    def listar_clientes(cls):
        clientes = Clientes.listar()
        if not clientes:  # Verifica se a lista está vazia
            print("Sem clientes cadastrados")
        else:
            for cliente in clientes:
                print(cliente)


UI.main()            