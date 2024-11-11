import java.util.Scanner;

public static class UI{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);       

        int op = 0;
        while (op != 9){
            if (menu() == 1){

            } else if (menu() == 2){
                inserirCliente();
            } else if (menu() == 3){

            } else if (menu() == 4){

            }
        }

        System.out.println("Sistema finalizado.");
    }

    public static int menu(){
        System.out.println("1 - Listar \n2 - Inserir \n3 - Atualizar \n4 - Excluir \n9 - Finalizar programa");
        System.out.println("Digite a opção: ");
        int opcao = input.nextInt();
        return opcao;
    }

    public static void inserirCliente(){
        System.out.println("ID: ");
        int id = input.nextInt();

        input.nextLine();

        System.out.println("Nome: ");
        String nome = input.nextLine();
    
        System.out.println("Email: ");
        String email = input.nextLine();

        System.out.println("Fone: ");
        String fone = input.nextLine();

        Cliente c = new Cliente(id, nome, email, fone);
        Clientes clientes = new Clientes();
        clientes.inserir(c);
    }
}