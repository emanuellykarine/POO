public class Viagem {
    private double distancia;
    private double tempo;

    public Viagem(){
        distancia = 0;
        tempo = 0;
    }

    public void setDistancia(double d){
        if (d > 0) distancia = d;
        else throw new IllegalArgumentException("A distancia nao pode ser negativa");
    }

    public void setTempo(double t){
        if (t > 0) tempo = t;
        else throw new IllegalArgumentException("O tempo não pode ser negativo.");
    }

    public double getDistancia(){
        return distancia;
    }

    public double getTempo(){
        return tempo;
    }

    public double velocidadeMedia(){
        return distancia / tempo;
    }
}
