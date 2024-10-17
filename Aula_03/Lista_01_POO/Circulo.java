public class Circulo {
    // Atributo
    public int raio;
    public double area;
    public int circunferencia;

    // Método área
    public double area (int raio) {
        area = 3.14 * raio * raio;
        return area;
    }

    // Método circunferencia
    public double circunferencia (int raio) {
        circunferencia = 2 * 3.14 * raio;
        return circunferencia;
    }
}