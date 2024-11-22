import java.util.Scanner;

public class validacaoNotas{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int cont = 0;
        double media = 0;
        float nota;

        while (cont != 2){
            nota = teclado.nextFloat();
            if (nota >= 0.0 && nota <= 10.0){
                cont += 1;
                media += nota;
            } else {
                System.out.println("nota invalida");
            }
        }
        teclado.close();

        String mediaF = String.format("%.2f", media/2);
        System.out.print("media = " + mediaF + "\n");
        
    }
}