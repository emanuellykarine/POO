import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        boolean valido;
        String frase;
        String[] palavras;

        while (valido == True){
            frase = teclado.nextLine();
            if (frase == "*"){
                break;
            } else {
                palavras = frase.split("\\s");
                valido = True;
                
            }
        }
    }
}