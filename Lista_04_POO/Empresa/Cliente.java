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
        
    }
}