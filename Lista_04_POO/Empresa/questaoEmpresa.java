import java.util.Scanner;

public class questaoEmpresa{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int op = 0;
        Empresa empresa = null;

        while (op != 4){
            System.out.println("1 - Cadastrar empresa \n2 - Cadastrar cliente \n3 - Listar clientes \n4 - Finalizar");
            op = input.nextInt();
            input.nextLine();
            if (op == 1){
                System.out.println("Digite o nome da empresa:");
                String nomeEmpresa = input.nextLine();
                empresa = new Empresa(nomeEmpresa);
            } else if (op == 2){
                if (empresa == null){
                    System.out.println("Nenhuma empresa cadastrada.");
                } else {
                    System.out.println("Digite o nome do cliente: ");
                    String nomeCliente = input.nextLine();
                    System.out.println("Digite o CPF do cliente: ");
                    String CPFCliente = input.nextLine();
                    System.out.println("Digite o limite de crédito: ");
                    double limiteCliente = input.nextDouble();
                    Cliente cliente = new Cliente(nomeCliente, CPFCliente, limiteCliente);
                    empresa.inserir(cliente);

                    System.out.println("Deseja inserir sócio? \n1 - Sim \n2 - Não");
                    int opSocio = input.nextInt();
                    input.nextLine();
                    if (opSocio == 1){
                        System.out.println("Digite o nome do sócio: ");
                        String nomeSocio = input.nextLine();
                        System.out.println("Digite o CPF do sócio: ");
                        String CPFSocio = input.nextLine();
                        System.out.println("Digite o limite de crédito: ");
                        double limiteSocio = input.nextDouble();

                        Cliente socio = new Cliente(nomeSocio, CPFSocio, limiteSocio);
                        empresa.inserir(socio);
                        cliente.setSocio(socio);
                    } 
                }
            } else if (op == 3) {
                if (empresa == null) {
                    System.out.println("Sem empresa criada.");
                } else {
                    System.out.println(empresa);
                    for (Cliente cliente : empresa.listar()) {
                        System.out.println(cliente);
                    }
                }
            } else {
                System.out.print("Programa finalizado");
            }
        }

    }
}  