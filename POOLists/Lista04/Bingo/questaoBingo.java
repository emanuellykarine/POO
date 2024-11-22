import java.util.Scanner;

public class questaoBingo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int op = 0;

        System.out.println("Quantas bolas terá o bingo? ");
        int numBolas = input.nextInt();
        Bingo b = new Bingo(numBolas);

        while (op != 3) {
            System.out.println("1 - Sortear bola \n2 - Ver lista de bolas sorteadas \n3 - Finalizar");
            System.out.print("Opcao: ");
            op = input.nextInt();

            if  (op == 1){
                if (b.qtdBolas() == -1) {
                    System.out.println("ja foram sorteadas todas as bolas.");
                } else {
                    System.out.println("a bola sorteada = " + b.proximo());
                }
            } else if (op == 2) {
                System.out.println(b.sorteados());
            } else {
                System.out.println("Bolas sorteadas = " + b.sorteados());
                System.out.println("Programa finalizado");
            }
        }
        input.close();
    }
}