public class Produto {
    private int id;
    private String descricao;
    private int estoque;
    private int IdCategoria;
    private float preco;

    public Produto(int id, String d, float p, int e){
        setId(id);
        setDescricao(d);
        setPreco(p);
        setEstoque(e);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setDescricao(String d){
        this.descricao = d;
    }

    public void setEstoque(int e){
        this.estoque = e;
    }

    public void setIdCategoria(int IdCategoria){
        this.IdCategoria = IdCategoria;
    }

    public void setPreco(float p){
        this.preco = p;
    }

    public int getId(){
        return this.id;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public float getPreco(){
        return this.preco;
    }

    public int getEstoque(){
        return this.estoque;
    }

    public int getIdCategoria(){
        return this.IdCategoria;
    }

    public String toString(){
        return String.format("Produtos \n ID = %s - Descrição = %s - Preço = %s - Estoque = %s - ID Categoria = %s", id, descricao, preco, estoque, IdCategoria);    
    }
}