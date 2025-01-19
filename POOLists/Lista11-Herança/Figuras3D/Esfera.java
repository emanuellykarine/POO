public class Esfera extends Figura3D{
    private double raio;
    
    public Esfera(double raio){
        this.raio = raio; 
    }

    @Override
    public double getVolume(){
        return (4/3 * 3.14 * (raio*raio*raio));
    }

    @Override
    public String toString() {
        return "Esfera (raio: " + raio + ")";
    }
}