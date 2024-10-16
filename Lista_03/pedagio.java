import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String linha1 = teclado.nextLine();
        String[] valores1 = linha1.split("\\s");
        int L = Integer.parseInt(valores1[0]);
        int D = Integer.parseInt(valores1[1]);

        String linha2 = teclado.nextLine();
        String[] valores2 = linha2. split("\\s");
        int K = Integer.parseInt(valores2[0]);
        int P = Integer.parseInt(valores2[1]);

        teclado.close();
        int custo = (L * K) + (L / D * P);

        System.out.print(custo + "\n");

    }
}