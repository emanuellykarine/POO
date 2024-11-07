import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class questaoPaciente{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome, cpf, telefone;
        String nascimento;

        System.out.println("Digite o nome do paciente: ");
        nome = input.nextLine();

        System.out.println("Digite o CPF do paciente: ");
        cpf = input.nextLine();

        System.out.println("Digite o numero de telefone: ");
        telefone = input.nextLine();

        System.out.println("Digite a data de nascimento (ex: DD/MM/AAAA):");
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        nascimento = input.nextLine();

        LocalDate dataNascimento = LocalDate.parse(nascimento, dataFormatada);

        Paciente paciente = new Paciente(nome, cpf, telefone, dataNascimento);

        System.out.println("Dados do paciente: \n" + paciente);
    
        input.close();
    }
}