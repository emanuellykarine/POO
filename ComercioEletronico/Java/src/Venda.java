import java.time.LocalDate;

public class Venda {
    private int id;
    private LocalDate data;
    private boolean carrinho;
    private float total;
    private int idCliente;

    public Venda(int id){
        setId(id);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    public void setCarrinho(boolean c){
        this.carrinho = c;
    }

    public void setTotal(float t){
        this.total = t;
    }

    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }

    public int getId(){
        return this.id;
    }

    public LocalDate getData(){
        return this.data;
    }

    public boolean getCarrinho(){
        return this.carrinho;
    }

    public float getTotal(){
        return this.total;
    }

    public int getIdCliente(){
        return this.idCliente;
    }

    public String toString(){
        return String.format("Venda \n ID = %s - Data = %s - Carrinho = %s - Total = %s - ID cliente = %s", id, data, carrinho, total, idCliente);    
    }
}