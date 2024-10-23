import java.util.Scanner;

public class questao1 {
    public static int maior (int x, int y) {
        int maior;
        if (x > y) {
            maior = x;
        } else {
            maior = y;
        }

        return maior;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros: ");
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        teclado.close();

        System.out.println("O maior valor é: " + maior(x, y));
    }
}