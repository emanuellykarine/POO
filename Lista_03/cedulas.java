import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int valor = teclado.nextInt();
        teclado.close();

        int nota100 = valor / 100;
        int nota50 = (valor - nota100 * 100) / 50;
        int nota20 = (valor - nota100 * 100 - nota50 * 50) / 20;
        int nota10 = (valor - nota100 * 100 - nota50 * 50 - nota20 * 20) / 10;
        int nota5 = (valor - nota100 * 100 - nota50 * 50 - nota20 * 20 - nota10 * 10) / 5;
        int nota2 = (valor - nota100 * 100 - nota50 * 50 - nota20 * 20 - nota10 * 10 - nota5 * 5) / 2;
        int nota1 = (valor - nota100 * 100 - nota50 * 50 - nota20 * 20 - nota10 * 10 - nota5 * 5 - nota2 * 2);

        System.out.print(valor + "\n");
        System.out.print(nota100 + " nota(s) de R$ 100,00\n");
        System.out.print(nota50 + " nota(s) de R$ 50,00\n");
        System.out.print(nota20 + " nota(s) de R$ 20,00\n");
        System.out.print(nota10 + " nota(s) de R$ 10,00\n");
        System.out.print(nota5 + " nota(s) de R$ 5,00\n");
        System.out.print(nota2 + " nota(s) de R$ 2,00\n");
        System.out.print(nota1 + " nota(s) de R$ 1,00\n");

    }
}