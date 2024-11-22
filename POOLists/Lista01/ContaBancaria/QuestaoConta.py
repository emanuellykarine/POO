class Conta:
    def __init__(self):
        self.nome = ""
        self.numeroConta = 0
        self.saldo = 0.0
        self.valor = 0.0
    
    def deposito(self):
        return self.saldo + self.valor

    def saque(self):
        return self.saldo - self.valor

dadosConta = Conta()

dadosConta.nome = str(input("Digite o nome do titular da conta: "))
dadosConta.numeroConta = int(input("Digite o numero da conta: "))
dadosConta.saldo = float(input("Digite o saldo da conta: R$ "))

operacao = int(input("Você deseja fazer a operação de depósito(1) ou saque(2): "))
if (operacao == 1):
    dadosConta.valor = float(input("Digite o valor que você deseja depositar: R$ "));
    novoSaldo = dadosConta.deposito()
else:
    dadosConta.valor = float(input("Digite o valor que você deseja sacar: R$ "));
    novoSaldo = dadosConta.saque()

print ("Nome do titular = ", dadosConta.nome)
print ("Número da conta = ", dadosConta.numeroConta)
print (f"Saldo atual = R$ {novoSaldo:.2f}")
