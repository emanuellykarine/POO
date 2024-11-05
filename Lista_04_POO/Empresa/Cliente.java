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
        this.limite += c.limite;
        c.limite = this.limite;
        socio = c;
    }

    public double getLimite(){
        return this.limite;
    }

    public String toString(){
        if (this.socio != null){
            return String.format("Cliente Nome = %s, CPF = %s, Limite = R$ %s \nSocio(a) de %s: Nome = %s CPF = %s", this.nome, this.cpf, this.limite, this.nome, socio.nome, socio.cpf);
        } else {
            return String.format("Cliente Nome = %s, CPF = %s, Limite = R$ %s", nome, cpf, limite);
        }
    }
}