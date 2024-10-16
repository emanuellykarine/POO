import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int teste = 1;
        boolean valido = true;

        while (valido) {
            int N = teclado.nextInt();
            if (N == 0) {
                break;
            } else {
                ArrayList<Integer> X = new ArrayList<>();
                ArrayList<Integer> Y = new ArrayList<>();
                ArrayList<Integer> V = new ArrayList<>();
                ArrayList<Integer> U = new ArrayList<>();

                int cont = 0;
                while (cont < N) {
                    int x = teclado.nextInt();
                    int y = teclado.nextInt();
                    int v = teclado.nextInt();
                    int u = teclado.nextInt();

                    X.add(x);
                    Y.add(y);
                    V.add(v);
                    U.add(u);
                    cont++;

                } 

                int x = X.stream().max(Integer::compare).get();
                int y = Y.stream().min(Integer::compare).get();
                int v = V.stream().min(Integer::compare).get();
                int u = U.stream().max(Integer::compare).get();

                System.out.println("Teste " + teste);
                if (x > v || y < u) {
                    System.out.println("nenhum\n");
                } else {
                    System.out.println(x + " " + y + " " + v + " " + u + "\n");
                
            }

            ++teste;
        }
    }
    }
}