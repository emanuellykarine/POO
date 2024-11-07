import java.time.LocalDate;
import java.time.Period;

public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate nascimento;

    public Paciente(String n, String c, String t, LocalDate nasc){
        nome = n;
        cpf = c;
        telefone = t;
        nascimento = nasc;
    }

    public String idade(){
        LocalDate dataAtual = LocalDate.now(); //Cria um objeto
        Period idade = Period.between(nascimento, dataAtual);
        int anos = idade.getYears();
        int meses = idade.getMonths();
        int dias = idade.getDays();
        if (anos > 0){
            return String.format("%s anos", anos);
        } else if (meses > 0) {
            return String.format("% meses", meses);
        } else {
            return String.format("% dias", dias);
        }
    }

    public String toString(){
        return String.format("Nome do paciente = %s \nCPF = %s \nTelefone = %s \nData de nascimento = %s \nIdade = %s", nome, cpf, telefone, nascimento, idade());
    }
}