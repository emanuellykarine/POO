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
        if (op == 1){
            novoSaldo = c.deposito(input.nextDouble());
        } else {
            novoSaldo = c.saque(input.nextDouble());
        }
    
        System.out.println(novoSaldo);
    }
}
