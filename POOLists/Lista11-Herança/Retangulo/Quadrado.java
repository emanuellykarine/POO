public class Quadrado extends Retangulo{
    public Quadrado(double lado){
        super(lado, lado);
    }

    public String toString(){
        return String.format("Quadrado [base=%.2f, altura=%.2f, área=%.2f, diagonal=%.2f]",
                base, altura, calcArea(), calcDiagonal());
    }
}