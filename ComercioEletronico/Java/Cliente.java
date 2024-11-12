public class Cliente {
    private int id;
    private String nome;
    private String email;
    private String fone;

    public Cliente(String n, String e, String f, int id){
        setNomeEmailTel(n, e, f);
        setId(id);
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNomeEmailTel(String n, String e, String f){
        nome = n;
        email = e;
        fone = f;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getTel(){
        return fone;
    }

    public int getID(){
        return id;
    }

    public String toString(){
        return String.format("informações do cliente \n ID = %s \n Nome = %s \n Email = %s \n Telefone = %s", id, nome, email, fone);    
    }
}