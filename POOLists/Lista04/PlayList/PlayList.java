import java.util.ArrayList;
import java.util.List;

public class PlayList{
    private String nome;
    private String descricao;
    private List<Musica> musicas = new ArrayList<>();

    public PlayList(String nome, String descricao){
        setNome(nome);
        setDescricao(descricao);
    }

    public void setNome(String nome){
        if (!musicas.contains(nome)) this.nome = nome;
        else throw new IllegalArgumentException("Nome de playlist ja cadastrada.");
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getNome(){
        return this.nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void inserir(Musica m){
        musicas.add(m);
    }

    public Musica[] listar() {
        return musicas.toArray(new Musica[0]);
    }
    

    public String toString(){
        return String.format("Musicas cadastradas = " + musicas.size() + " musicas");
    }


}