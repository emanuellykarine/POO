import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bingo{
    private int numBolas;
    private List<Integer> bolas = new ArrayList<>(this.numBolas);

    public Bingo(int numBolas){
        if (numBolas > 0) this.numBolas = numBolas;
        else throw new IllegalArgumentException("O valor não pode ser menor que um."); 
    }

    public int proximo(){
        Random random = new Random();
        int numero = random.nextInt(1, this.numBolas+1);
        if (!bolas.contains(numero)){
            bolas.add(numero);
            return numero;
        } else {
            return proximo();
        }
    }

    public List<Integer> sorteados(){
        return bolas;
    }

    public int qtdBolas(){
        if (bolas.size() == this.numBolas){
            return -1;
        } else {
            return 0;
        }
    }

}