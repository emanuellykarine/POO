import java.util.ArrayList;
import java.util.List;

public static class Clientes{
    private List<Cliente> objetos = new ArrayList<>();

    public void inserir(Cliente obj){
        objetos.add(obj);
    }

    public List<Cliente> listar(){
        return objetos.toArray(new Cliente[0]);
    }

    public Cliente listarID(int id){

    }

    public void atualizar(Cliente obj){

    }

    public void excluir(Cliente obj){

    }

    public void abrir(){
        
    }

    public void salvar(){}

}