import java.util.Scanner;

public class questaoViagem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Viagem v = new Viagem();

        System.out.println("Digite a distancia percorrida: ");
        v.setDistancia(input.nextDouble());
        System.out.println("Digite o tempo: (ex: 1,5)");
        v.setTempo(input.nextDouble());

        System.out.println(String.format("Velocidade media = %.2f", v.velocidadeMedia()));
    
        input.close();
    }
    
}
