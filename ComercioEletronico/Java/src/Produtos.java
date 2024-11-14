import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class Produtos{
    private static List<Produto> objetos = new ArrayList<Produto>();

    public static void inserir(Produto obj){
        abrir();
        int id = 0;
        for (Produto produto: objetos) {
            if(produto.getID() > id) id = produto.getID();
        }
        obj.setId(id + 1);
        objetos.add(obj);
        System.out.println("Produto adicionado.");
        salvar();
    }

    public static List<Produto> listar(){
        abrir();
        return objetos;
    }

    public static Produto listarID(int id){
        abrir();
        for (Produto produto : objetos) {
            if (produto.getID() == id) return produto;
        }
        return null;
    }

    public static void atualizar(Produto obj){
        Produto produto = listarID(obj.getID());
        if (produto != null) {
            produto.setDescricao(obj.getDescricao());
            produto.setPreco(obj.getPreco());
            produto.setEstoque(obj.getEstoque());
            produto.setIdCategoria(obj.getIdCategoria);
            salvar();
            System.out.println("Dados atualizados.");
        } else {
            System.out.println("Produto não cadastrado.");
        }
    }

    public static void excluir(Cliente obj){
        Produto produto = listarID(obj.getID());
        if (produto != null) {
            objetos.remove(produto);
            salvar();
            System.out.println("Produto excluído.");
        } else {
            System.out.println("Produto não cadastrado.");
        }
    }

    public static void abrir(){
        objetos.clear();  // Limpa a lista antes de carregar
        try {
            FileReader reader = new FileReader("produtos.json");
            Type listType = new TypeToken<List<Produto>>(){}.getType();
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
            FileWriter writer = new FileWriter("produtos.json");
            Gson gson = new Gson();
            gson.toJson(objetos, writer);  // Converte a lista para JSON e escreve no arquivo
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}