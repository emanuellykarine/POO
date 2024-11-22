import java.util.ArrayList;
import java.util.List;

public class Empresa{
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();

    public Empresa(String nome){
        setNome(nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void inserir (Cliente c){
        if (!clientes.contains(c)){
            clientes.add(c);
        } else {
            throw new IllegalArgumentException("Cliente já cadastrado.");
        }
    }

    public Cliente[] listar(){
        return clientes.toArray(new Cliente[0]);
    }

    public String toString(){
        return String.format("A empresa " + nome + " tem " + clientes.size() + " clientes.");
    }

}