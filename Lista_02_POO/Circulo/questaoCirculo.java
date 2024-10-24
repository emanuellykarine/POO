import java.util.Scanner;

public class questaoCirculo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Circulo c = new Circulo();
        System.out.println("Digite o raio do circulo;");
        c.setRaio(input.nextDouble());

        System.out.println("O raio digitado foi:" + c.getRaio());
    
        System.out.println(String.format("Area = %.2f", c.area()));
        System.out.println(String.format("Circunferencia = %.2f", c.circunferencia()));
        
        input.close();
    }
}
