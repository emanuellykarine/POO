import java.util.Scanner;

public class questao2 {
    public static int maior (int x, int y, int z) {
        int maior;
        if (x > y & x > z) {
            maior = x;
        } else if (y > z) {
            maior = y;
        } else {
            maior = z;
        }

        return maior;
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite três valores inteiros: ");
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int z = teclado.nextInt();

        teclado.close();
        System.out.println("O maior valor é: " + maior(x, y, z));
    }
}