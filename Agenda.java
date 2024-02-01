import java.util.Scanner;
public class Agenda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String nome, telefone, email;

        while (opt != 3){
            System.out.println("\nEscolha de acordo com os números:\n1. Adicionar novo contato\n2. Buscar contato\n3. Sair");
            opt = sc.nextInt();
            switch (opt){
                case 1:
                    //Adiciona Contato
                    System.out.println("Nome: ");
                        nome = sc.nextLine();
                        nome = sc.nextLine();
                    System.out.println("Telefone: ");
                        telefone = sc.nextLine();
                    System.out.println("E-mail: ");
                        email = sc.nextLine();

                    ListaContatos pessoa = new ListaContatos(nome, telefone, email);
                    String adicionado = String.valueOf(ListaContatos.addContato(pessoa));
                    System.out.println(adicionado.toString());
                    break;
                case 2:
                    //Busca contato
                    //ListaContatos buscar = new ListaContatos();
                    System.out.println("Buscar nome do contato: ");
                    String nomeBuscar = sc.nextLine();
                    sc.nextLine();

                    String resultado = ListaContatos.buscarContatos(nomeBuscar);

                    if (resultado == null) {
                        System.err.println("Contato não encontrado.");
                    }else {
                        System.out.println("\nContato encontrado:\n" + resultado);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Opção inválida!");
                    break;
            }
        }
    }
}
