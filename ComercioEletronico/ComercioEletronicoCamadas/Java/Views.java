public class View{
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
}