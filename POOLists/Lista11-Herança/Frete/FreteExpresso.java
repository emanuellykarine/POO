public class FreteExpresso extends Frete{
    private double seguro;
    public FreteExpresso(double distancia, double peso, double seguro){
        super(distancia, peso);
        this.seguro = seguro;
    }

    public double valorFrete(){
        double freteComum = super.valorFrete();
        return (freteComum * 2) + (0.01 * seguro);
    }

    public String toString(){
        return String.format("Distância: %.2f Km, Peso: %.2f Kg, Valor Segurado: R$ %.2f, Valor do Frete Expresso: R$ %.2f",
                 distancia, peso, seguro, valorFrete());
    }
}