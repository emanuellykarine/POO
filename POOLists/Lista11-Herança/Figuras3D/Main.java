public class Main{
    public static void main(String[] args) {
        
        Figura3D esfera = new Esfera(3.0);
        System.out.println(esfera.toString() + " -> Volume: " + esfera.getVolume());

        // Criação de um cubo com lado 4
        Figura3D cubo = new Cubo(4.0);
        System.out.println(cubo.toString() + " -> Volume: " + cubo.getVolume());
    }
}