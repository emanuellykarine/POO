import java.util.Scanner;

class Conta {
    //Atributos
    String nome;
    int numeroConta;
    double saldo;
    double valor;

    public double deposito(){
        return saldo+valor;
    }

    public double saque(){
        return saldo - valor;
    }
}

public class QuestaoConta{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta dadosConta = new Conta();

        System.out.print("Digite o nome do titular da conta: ");
        dadosConta.nome = teclado.nextLine();

        System.out.print("Digite o número da conta: ");
        dadosConta.numeroConta = teclado.nextInt();

        System.out.print("Digite o saldo da conta: R$ ");
        dadosConta.saldo = teclado.nextDouble();

        System.out.print("Você deseja fazer a operação de depósito(1) ou a operação de saque(2)?");
        int operacao = teclado.nextInt();

        double novoSaldo;
        if (operacao == 1){
            System.out.print("Digite o valor que vc deseja depositar: R$");
            dadosConta.valor = teclado.nextDouble();
            novoSaldo = dadosConta.deposito();
        } else {
            System.out.print("Digite o valor que vc deseja sacar: R$");
            dadosConta.valor = teclado.nextDouble();
            novoSaldo = dadosConta.saque();
        }

        System.out.println("Nome do titular: " + dadosConta.nome);
        System.out.println("Número da conta: " + dadosConta.numeroConta);
        System.out.println(String.format("Saldo atual: R$ %.2f", novoSaldo));
    }
}