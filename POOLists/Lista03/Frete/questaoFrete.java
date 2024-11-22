import java.util.Scanner;

public class questaoFrete{
    public static void main(String[] args){
        double peso = 0, distancia = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso da carga:");
        peso = input.nextDouble();

        System.out.println("Digite a distancia percorrida:");
        distancia = input.nextDouble();
    
        Frete f = new Frete(peso, distancia);
        System.out.println(f.toString());
        System.out.println(String.format("Frete = R$ %.2f", f.calcFrete()));
        input.close();
    }
}