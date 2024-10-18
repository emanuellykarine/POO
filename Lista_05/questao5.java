import java.util.Scanner;

public class questao5{
    public static String formatar_nome(String nomeCom){
        String resultado = "";
        for (int i = 0; i < nomeCom.length(); i++) {
            if (i == 0 || nomeCom.charAt(i-1) == ' ') {
                resultado += Character.toUpperCase(nomeCom.charAt(i));
            } else {
                resultado += nomeCom.charAt(i);                                                  
            }
        }
            return resultado;   
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeCom = teclado.nextLine();

        teclado.close();

        System.out.println(formatar_nome(nomeCom));
}
}