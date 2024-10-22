import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a base e a altura do triângulo: ");
        int base = teclado.nextInt();
        int altura = teclado.nextInt();

        int area = (base * altura) / 2;
        
        System.out.println("A área do triângulo é: " + area);
        teclado.close();
    }
}