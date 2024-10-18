import java.util.Scanner;
import java.util.ArrayList;

public class questao3{
    public static String iniciais(String nomeCom){
        String[] nome = nomeCom.split(" ");
        ArrayList<Character> listaChar = new ArrayList<>(); 

        for (int a = 0; a < nome.length; ++a){
            char inicial = nome[a].charAt(0);
            listaChar.add(inicial);
        }

        return listaChar.toString();
    }

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = teclado.nextLine();

        System.out.println(iniciais(nomeCompleto));
        teclado.close();
    }
}