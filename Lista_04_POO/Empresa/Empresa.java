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
        clientes.add(c);
    }

    public Cliente[] listar(){
        return listar.toArray(new Cliente[0]);
    }

    public String toString(){
        return String.format("A empresa %s tem &d clientes.", nome, clientes.size());
    }

}