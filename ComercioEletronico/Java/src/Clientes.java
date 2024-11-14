import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class Clientes{
    private static List<Cliente> objetos = new ArrayList<Cliente>();

    public static void inserir(Cliente obj){
        abrir();
        int id = 0;
        for (Cliente cliente: objetos) {
            if(cliente.getID() > id) id = cliente.getID();
        }
        obj.setId(id + 1);
        objetos.add(obj);
        System.out.println("Cliente adicionado.");
        salvar();
    }

    public static List<Cliente> listar(){
        abrir();
        return objetos;
    }

    public static Cliente listarID(int id){
        abrir();
        for (Cliente cliente : objetos) {
            if (cliente.getID() == id) return cliente;
        }
        return null;
    }

    public static void atualizar(Cliente obj){
        Cliente cliente = listarID(obj.getID());
        if (cliente != null) {
            cliente.setNome(obj.getNome());
            cliente.setEmail(obj.getEmail());
            cliente.setFone(obj.getFone());
            salvar();
            System.out.println("Dados atualizados.");
        } else {
            System.out.println("Cliente não cadastrado.");
        }
    }

    public static void excluir(Cliente obj){
        Cliente cliente = listarID(obj.getID());
        if (cliente != null) {
            objetos.remove(cliente);
            salvar();
            System.out.println("Cliente excluído.");
        } else {
            System.out.println("Cliente não existe");
        }
    }

    public static void abrir(){
        objetos.clear();  // Limpa a lista antes de carregar
        try {
            FileReader reader = new FileReader("clientes.json");
            Type listType = new TypeToken<List<Cliente>>(){}.getType();
            objetos = new Gson().fromJson(reader, listType);
            reader.close();
        } catch (FileNotFoundException e) {
            // Se o arquivo não for encontrado, inicia uma lista vazia
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void salvar(){
        try {
            FileWriter writer = new FileWriter("clientes.json");
            Gson gson = new Gson();
            gson.toJson(objetos, writer);  // Converte a lista para JSON e escreve no arquivo
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}