import java.util.Scanner;

class Triangulo{
    private double b, h;

    // Construtor
    public Triangulo(){
        b = 0;
        h = 0;
    }

    public void set_base(double base){
        if (base > 0) b = base;
        else throw new IllegalArgumentException("a base nao pode ser negativa.");
    }

    public void set_altura(double altura){
        if (altura > 0) h = altura;
        else throw new IllegalArgumentException("a altura nao pode ser negativo.");
    }

    public double get_base(){
        return b;
    }

    public double get_altura(){
        return h;
    }

    public double calc_area(){
        return (b * h) / 2;
    }
}

public class areaTriangulo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Triangulo t = new Triangulo();
        
        System.out.println("Digite a base e a altura do triangulo: ");
        t.set_base(teclado.nextDouble());
        t.set_altura(teclado.nextDouble());

        System.out.println("A base digitada: " + t.get_base());
        System.out.println("A altura digitada: " + t.get_altura());

        System.out.println(String.format("A area do triangulo eh: %.2f", t.calc_area()));
        teclado.close();
    }
}