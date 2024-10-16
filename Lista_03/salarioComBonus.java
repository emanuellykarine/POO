import java.text.NumberFormat;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome = teclado.nextLine();
        double salario = teclado.nextDouble();
        double vendas = teclado.nextDouble();

        teclado.close();

        double total = salario + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}