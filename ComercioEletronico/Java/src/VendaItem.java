public class VendaItem {
    private int id;
    private int qtd;
    private int IdVenda;
    private int IdProduto;
    private float preco;

    public Venda(int id, int qtd, float p){
        setId(id);
        setQtd(qtd);
        setPreco(p);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    public void setIdVenda(int IdVenda){
        this.IdVenda = IdVenda;
    }

    public void setIdProduto(int IdProduto){
        this.IdProduto = IdProduto;
    }

    public void setPreco(float p){
        this.preco = p;
    }

    public int getId(){
        return this.id;
    }

    public int getQtd(){
        return this.qtd;
    }

    public float getPreco(){
        return this.preco;
    }

    public int getIdVenda(){
        return this.IdVenda;
    }

    public int getIdProduto(){
        return this.IdProduto;
    }

    public String toString(){
        return String.format("Itens \n ID = %s - Quantidade = %s - Preço = %s - ID Venda = %s - ID Produto= %s", id, qtd, preco, IdVenda, IdProduto);    
    }
}