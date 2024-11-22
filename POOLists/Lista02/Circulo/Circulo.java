public class Circulo {
    private double raio;
    
    public Circulo(){
        raio = 0;
    }

    public void setRaio(double r){
        if (r > 0) raio = r;
        else throw new IllegalArgumentException("o raio não pode ser valor negativo");
    }

    public double getRaio(){
        return raio;
    }
    // Método área
    public double area() {
        return 3.14 * raio * raio;
    }

    // Método circunferencia
    public double circunferencia () {
        return 2 * 3.14 * raio;
    }
    
}
