public class Frete{
    private double peso;
    private double distancia;

    public Frete(double p, double d){
        setPeso(p);
        setDistancia(d);
    }

    public void setDistancia(double d){
        if (d > 0) distancia = d;
        else throw new IllegalArgumentException("A distancia nao pode ser negativa"); 
    }

    public void setPeso(double p){
        if (p > 0) peso = p;
        else throw new IllegalArgumentException("O peso nao pode ser negativo");
    }

    public double getDistancia(){
        return distancia;
    }

    public double getPeso(){
        return peso;
    }

    public double calcFrete(){
        return (peso / distancia) * 0.01;
    }

    public String toString(){
        return (String.format("O peso da carga = %.1fKg \nDistancia percorrida = %.0fKm", peso, distancia));
    }
}