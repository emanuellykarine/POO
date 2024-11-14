import java.util.Scanner;
import java.util.List;

public class UI{
    static Scanner input = new Scanner(System.in);  

    public static int menu(){
        System.out.println("1 - Inserir \n2 - Listar \n3 - Atualizar \n4 - Excluir \n9 - Finalizar programa");
        System.out.print("Digite a opção: ");
        int opcao = input.nextInt();
        input.nextLine();
        return opcao;
    }

    public static void main(String[] args){
        int op = 0;
        while (op != 9){
            op = menu();
            if (op == 1){
                inserirCliente();
            } else if (op == 2){
                listarCliente();
            } else if (op == 3){
                atualizarCliente();
            } else if (op == 4){
                excluirCliente();
            }
        }
        System.out.println("Sistema finalizado.");
    }

    public static void inserirCliente(){
        System.out.println("Nome: ");
        String nome = input.nextLine();
    
        System.out.println("Email: ");
        String email = input.nextLine();

        System.out.println("Fone: ");
        String fone = input.nextLine();

        Cliente c = new Cliente(0, nome, email, fone);
        Clientes.inserir(c);
    }

    public static void listarCliente(){
        List<Cliente> clientes = Clientes.listar();

        if (clientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public static void atualizarCliente(){
        listarCliente();

        System.out.println("Qual o id do cliente que você deseja alterar os dados: ");
        int id = input.nextInt();
        
        input.nextLine();

        System.out.println("Novo nome: ");
        String nome = input.nextLine();

        System.out.println("Novo email: ");
        String email = input.nextLine();
       
        System.out.println("Novo fone: ");
        String fone = input.nextLine();

        Cliente cliente = new Cliente(id, nome, email, fone);

        Clientes.atualizar(cliente);
    }

    public static void excluirCliente(){
        listarCliente();

        System.out.print("Qual o id do cliente que você deseja excluir: ");
        int id = input.nextInt();

        Cliente cliente = new Cliente(id, "", "", "");

        Clientes.excluir(cliente);
    }
}