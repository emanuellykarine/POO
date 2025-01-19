public class Retangulo{
    protected double base;
    protected double altura;
    
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public double calcArea(){
        return this.base * this.altura;
    }

    public double calcDiagonal(){
        return Math.sqrt(this.base * this.base + this.altura * this.altura);
    }

    public String toString(){
        return String.format("Retangulo [base=%.2f, altura=%.2f, área=%.2f, diagonal=%.2f]",
                base, altura, calcArea(), calcDiagonal());
    }
}
