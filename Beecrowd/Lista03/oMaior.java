import java.util.Scanner;
import java.math.*;

public class oMaior {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        String linha = teclado.nextLine();
        String[] valores = linha.split("\\s");

        teclado.close();
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);

        int maior1 = ((a + b + (Math.abs(a-b))) / 2);
        int maior2 = ((maior1 + c + (Math.abs(maior1-c))) / 2);

        System.out.println(maior2 + " eh o maior");
        
    }
}