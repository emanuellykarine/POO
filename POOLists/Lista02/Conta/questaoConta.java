import java.util.Scanner;

public class questaoConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Conta c = new Conta();
        System.out.println("Digite o nome do titular da conta: ");
        c.getNome(input.nextLine());

        System.out.println("Digite numero da conta:");
        c.getNumero(input.nextInt());

        System.out.println("Digite o saldo da conta: ");
        c.getSaldo(input.nextDouble());
    
        System.out.println("----------------");
        System.out.println("1 - Saque   2 - Deposito");
        System.out.println("Qual opcao voce deseja: ");
        int op = input.nextInt();

        double novoSaldo = 0;
        if (op == 2){
            System.out.println("Digite o valor que deseja depositar: ");
            novoSaldo = c.deposito(input.nextDouble());
        } else {
            System.out.println("Digite o valor que deseja sacar: ");
            novoSaldo = c.saque(input.nextDouble());
        }
    
        System.out.println(String.format("Seu saldo atual: R$ %.2f", novoSaldo));
    }
}
