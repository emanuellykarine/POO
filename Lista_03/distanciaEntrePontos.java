import java.util.Scanner;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String linha1 = teclado.nextLine();
        String[] p1 = linha1.split("\\s");
        float x1 = Float.parseFloat(p1[0]);
        float y1 = Float.parseFloat(p1[1]);

        String linha2 = teclado.nextLine();
        String[] p2 = linha2.split("\\s");
        float x2 = Float.parseFloat(p2[0]);
        float y2 = Float.parseFloat(p2[1]);

        teclado.close();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        String distanciaF = String.format("%.4f", distancia);

        System.out.print(distanciaF + "\n");
    }
}