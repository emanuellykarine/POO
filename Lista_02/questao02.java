import java.util.Scanner;

public class questao02{
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = teclado.next();
        teclado.close();
        
        System.out.println("Bem-vindo(a) ao Java, " + nome);
    }
}