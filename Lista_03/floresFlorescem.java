import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        boolean valido = true;
        boolean codigo = true;

        while (codigo){
            String frase = teclado.nextLine().toLowerCase();
            if (frase.equals("*")){
                break;
            }

            String[] palavras = frase.split(" ");
            char letra = palavras[0].charAt(0);

            valido = true;
            for (int a = 0; a < palavras.length; ++a){
                if (palavras[a].charAt(0) != letra){
                    System.out.println("N");
                    valido = false;
                    break;
                }
            }

            if (valido) {
                System.out.println("Y");
            }
        }
    }
}