import java.util.Scanner;
import java.math.*;

public class primoRapido{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int cont = 0;
        int quantidade = teclado.nextInt();
        
        while (cont < quantidade){
            boolean primo = true;
            int valor = teclado.nextInt();
        
            int raiz = (int)Math.sqrt(valor);

            if (valor != 2 && valor % 2 == 0 || valor == 1){
                primo = false;
            }

            for (int div = 3; div <= raiz && primo; div += 2){
                if (valor % div == 0) {
                    primo = false; 
                }
            }
            
            if (primo){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
            cont++;
        }
    }
}