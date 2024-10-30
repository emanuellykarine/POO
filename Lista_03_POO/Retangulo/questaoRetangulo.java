import java.util.Scanner;

public class questaoRetangulo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double base = 0 , altura = 0;

        System.out.println("Informe a base do retângulo: ");
        base = input.nextDouble();
        System.out.println("Informe a altura do retângulo: ");
        altura = input.nextDouble();

        Retangulo r = new Retangulo(base, altura);

        System.out.println("Area = " + r.calcArea());
        System.out.println(String.format("Diagonal = %.2f", r.calcDiagonal()));
        System.out.println(r.toString());

    }

}
