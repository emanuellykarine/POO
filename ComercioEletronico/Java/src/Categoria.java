public class Categoria{
    private int id;
    private String descricao;

    public Categoria(int id, String d){
        setId(id);
        setDescricao(d);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setDescricao(String d){
        this.descricao = d;
    }

    public int getId(){
        return this.id;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public String toString(){
        return String.format("Categorias\n ID = %s - Descrição = %s", id, descricao);
    }
}