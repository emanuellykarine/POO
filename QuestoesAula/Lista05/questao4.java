import java.util.Scanner;

public class questao4 {
    public static boolean Aprovado(int nota1, int nota2){
        int media = (nota1 + nota2) / 2;
        if (media >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota1 = teclado.nextInt();
        int nota2 = teclado.nextInt();

        teclado.close();
        if (Aprovado(nota1, nota2)) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}