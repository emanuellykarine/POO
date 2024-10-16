import java.util.Scanner;

public class questao03 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro bimestre da disciplina: ");
        int nota1 = teclado.nextInt();

        System.out.println("Digite a nota do segundo bimestre da disciplina: ");
        int nota2 = teclado.nextInt();
        teclado.close();

        int media = (((nota1 * 2) + (nota2 * 3)) / 5);

        System.out.println("Média parcial = " + media);
    }
}