import java.util.Scanner;
import java.math.*;

public class guardaCosteira{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNext()){
            String linha = teclado.nextLine();
            String[] valores = linha.split(" ");
            int D = Integer.parseInt(valores[0]);
            int VF = Integer.parseInt(valores[1]);
            int VG = Integer.parseInt(valores[2]);

            double distanciaGC = Math.sqrt(144 + (D * D));
            double tempoF = 12 / VF;
            double tempoG = distanciaGC / VG;

            teclado.close();
            if (tempoG <= tempoF){
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        }
        
    }
}