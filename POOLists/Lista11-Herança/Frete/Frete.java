public class Frete{
    protected double distancia;
    protected double peso;

    public Frete(double distancia, double peso){
        this.distancia = distancia;
        this.peso = peso;
    }

    public double valorFrete(){
        return 0.01 * distancia * peso;
    }

    public String toString(){
        return String.format("Distância: %.2f Km, Peso: %.2f Kg, Valor do Frete: R$ %.2f",
                distancia, peso, valorFrete());
    }
}