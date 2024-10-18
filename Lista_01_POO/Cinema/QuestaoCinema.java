import java.util.Scanner;

class Cinema{
    String dia;
    int horario;

    public double ingressoDia(){
        if (dia.equals("Segunda") || dia.equals("Terça")|| dia.equals("Quinta") && horario > 17){
            if (horario >= 17){
                return 24;
            } else {
                return 16;
            }
        } else if (dia.equals("Sexta") || dia.equals("Sábado") || dia.equals("Domingo")) {
            if (horario >= 17) {
                return 30;
            } else {
                return 20;
            }
        } else{
            return 8;
        }
    }

}

public class QuestaoCinema{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cinema dadosCinema = new Cinema();

        System.out.print("Digite o dia da sessão(ex: Domingo): ");
        dadosCinema.dia = teclado.next();

        System.out.print("Digite o horário da sessão(ex: 15:30): ");
        String horarioString = teclado.next();
        String[] horarios = horarioString.split(":");
        dadosCinema.horario = Integer.parseInt(horarios[0]);

        System.out.println(String.format("Valor do ingresso = R$ %.2f", dadosCinema.ingressoDia()));
    }
}