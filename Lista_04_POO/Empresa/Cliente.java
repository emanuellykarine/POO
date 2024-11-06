public class Cliente{
    private String nome;
    private String cpf;
    private double limite;
    private Cliente socio;

    public Cliente(String nome, String cpf, double limite){
        this.nome = nome;
        this.cpf = cpf;
        this.limite = limite;
    }

    public void setSocio(Cliente c){
        socio = c;
        c = socio;
    }

    public double getLimite(){
        if (socio  == null){
            return this.limite;
        } else {
            return this.limite + socio.limite;
        }       
    }

    public String toString(){
        if (this.socio != null){
            return String.format("Cliente Nome = %s, CPF = %s, Limite Individual= R$ %s \nSocios: Nome = %s CPF = %s    Nome = %s CPF = %s Limite compartilhado = %s", this.nome, this.cpf, this.limite, this.nome, this.cpf, socio.nome, socio.cpf, getLimite());
        } else {
            return String.format("Cliente Nome = %s, CPF = %s, Limite Individual = R$ %s", nome, cpf, limite);
        }
    }
}