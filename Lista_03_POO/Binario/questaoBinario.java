import java.util.Scanner;

public class questaoBinario{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero inteiro e postivo: ");
        int num = input.nextInt();

        input.close();
        Conversor b = new Conversor(num);
        System.out.println(b.Binario());
    }
}