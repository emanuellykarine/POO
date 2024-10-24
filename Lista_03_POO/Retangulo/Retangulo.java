import java.math.*;

public class Retangulo {
    private double b;
    private double h;

    public Retangulo(double b, double h){
        b = 0;
        h = 0;
    }

    public void setBase(double b){
        if (b > 0) this.b = b;
        else throw new IllegalArgumentException("O valor não pode ser negativo");
    }

    public void setAltura(double h){
        if (b > 0) this.h = h;
        else throw new IllegalArgumentException("O valor não pode ser negativo");
    }

    public double getBase(){
        return this.b;
    }

    public double getAltura(){
        return this.h;
    }

    public double calcArea(){
        return this.b * this.h;
    }

    public double calcDiagonal(){
        return Math.sqrt((this.b * this.b) + (this.h * this.h));
    }

    public String toString(){
        return (String.format("Base = ", this.b, "Altura = ", this.h));
    }
}
