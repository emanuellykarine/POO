public class Main{
    public static void main(String[] args) {
        Frete frete = new Frete(100, 50);
        System.out.println(frete);

        FreteExpresso freteExpresso = new FreteExpresso(100, 50, 500);
        System.out.println(freteExpresso);
    }
}