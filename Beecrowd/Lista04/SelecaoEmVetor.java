import java.util.Scanner;
public class SelecaoEmVetor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] A = new double[100];

        for (int i = 0; i < 100; i++){
            A[i] = input.nextInt();
        }

        for (int i = 0; i < 100; i ++){
            if (A[i] <= 10){
                System.out.printf("A[%d] = %.1f\n", i, (float) A[i]);
            }
        }
    }
}