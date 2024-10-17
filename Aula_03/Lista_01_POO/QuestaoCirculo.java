import java.util.Scanner;

public class QuestaoCirculo{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Circulo dadosCirculo = new Circulo();

        System.out.println("Digite o raio do círculo: ");
        int raio = teclado.nextInt();

        System.out.println(dadosCirculo.area(raio));
        System.out.println(dadosCirculo.circunferencia(raio));
    }
}