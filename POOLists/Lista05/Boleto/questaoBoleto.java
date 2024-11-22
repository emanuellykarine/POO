import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class questaoBoleto{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Codigo de barras: ");
        String codBarras = input.nextLine();

        System.out.println("Data de emissão: ");
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataEmissao = input.nextLine();

        LocalDate emissao = LocalDate.parse(dataEmissao, dataFormatada);

        System.out.println("Data de vencimento: ");
        dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataVencimento = input.nextLine();

        LocalDate vencimento= LocalDate.parse(dataVencimento, dataFormatada);
    
        System.out.println("Valor do boleto: ");
        double valor = input.nextDouble();

        Boleto boleto = new Boleto(codBarras, emissao, vencimento, valor);

        System.out.println("Valor que deseja pagar no boleto: ");
        double valorPagar = input.nextDouble();
        boleto.Pagar(valorPagar);

        System.out.println("Informações do boleto: \n" + boleto);
        System.out.println("Situação do boleto: " + boleto.Situacao());
    }
}