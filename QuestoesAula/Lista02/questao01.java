import java.util.Scanner;

public class questao01{
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        teclado.close();
        System.out.println("Bem-vindo(a) ao Java, " + nome);
    }
}