import java.util.Scanner;

class Circulo {
    // Atributo
    public int raio;

    // Método área
    public double area () {
        return 3.14 * raio * raio;
    }

    // Método circunferencia
    public double circunferencia () {
        return 2 * 3.14 * raio;
    }
}

public class QuestaoCirculo{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Circulo dadosCirculo = new Circulo();

        System.out.println("Digite o raio do círculo: ");
        dadosCirculo.raio = teclado.nextInt();

        System.out.println(String.format("Área: %.2f", dadosCirculo.area()));
        System.out.println(String.format("Circunferencia: %.2f", dadosCirculo.circunferencia()));
    }
}