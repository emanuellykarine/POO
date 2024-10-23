import java.util.Scanner;

class Viagem{
    //Atributos
    public int distancia;
    public int tempo;

    //Método
    public double velocidade(){
        return distancia/tempo;
    }
}

public class QuestaoViagem{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        Viagem v = new Viagem();
        v.distancia = teclado.nextInt();
        v.tempo = teclado.nextInt();

        teclado.close();
        
        System.out.println("Velocidade média: " + v.velocidade());
    }
}