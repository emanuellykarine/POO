public class Cliente {
    private int id;
    private String nome;
    private String email;
    private String fone;

    public Cliente(int id, String n, String e, String f){
        setNome(n);
        setEmail(e);
        setFone(f);
        setId(id);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String n){
        if (n != "") this.nome = n;
        else throw new IllegalArgumentException("Campo nome vazio.");
    }

    public void setEmail(String e){
        if (e != "") this.email = e;
        else throw new IllegalArgumentException("Campo email vazio");
    }

    public void setFone(String f){
        if (f != "") this.fone = f;
        else throw new IllegalArgumentException("Campo fone vazio.");
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getFone(){
        return fone;
    }

    public int getID(){
        return id;
    }

    public String toString(){
        return String.format("Clientes \n ID = %s - Nome = %s - Email = %s - Telefone = %s", id, nome, email, fone);    
    }
}