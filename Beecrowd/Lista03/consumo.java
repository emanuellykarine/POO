import java.util.Scanner;

public class consumo{
    public static void main (String[] args){

        Scanner teclado = new Scanner(System.in);
        int distancia = teclado.nextInt();
        float combustivel = teclado.nextFloat();

        teclado.close();

        double consumo = (distancia / combustivel);
        String consumoF = String.format("%.3f", consumo);
        System.out.print(consumoF + " km/l\n");
    }
}