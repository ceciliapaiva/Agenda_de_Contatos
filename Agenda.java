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
                    //Adicionar Contato
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
                    //Buscar contato
                    ListaContatos buscar = new ListaContatos();
                    System.out.println("Pesquise pelo nome: ");
                    String nomeBuscar = sc.nextLine();
                    sc.nextLine();

                    ListaContatos resultado = buscar.buscarContatos(nomeBuscar);

                    if (resultado == null) {
                        System.err.println("Contato não encontrado.");
                    }else {
                        System.out.println("Contato encontrado:\n" + resultado.toString());
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
