public class Cubo extends Figura3D{
    private double lado;
    
    public Cubo(double lado){
        this.lado = lado; 
    }

    @Override
    public double getVolume(){
        return (lado*lado*lado);
    }

    @Override
    public String toString() {
        return "Cubo (lado: " + lado + ")";
    }
}