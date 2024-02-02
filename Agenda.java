import java.util.Scanner;
public class Agenda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String nome = "", telefone = "", email = "";

        while (opt != 3){
            System.out.println("\nEscolha de acordo com os números:\n1. Adicionar novo contato\n2. Buscar contato\n3. Sair");
            opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1: //Adiciona Contato
                    // Nome
                    boolean vNome = false;
                    while (!vNome) {
                        System.out.print("Nome: ");
                        nome = sc.nextLine();
                        vNome = ListaContatos.verificaNome(nome);
                    }
                    // Telefone
                    boolean vTelefone = false;
                    while (!vTelefone) {
                        System.out.print("Telefone: ");
                        telefone = sc.nextLine();
                        vTelefone = ListaContatos.verificaTel(telefone);
                    }
                    // Email
                    boolean vEmail = false;
                    while (!vEmail) {
                        System.out.print("E-mail: ");
                        email = sc.nextLine();
                        vEmail = ListaContatos.verificaEmail(email);
                    }

                    ListaContatos pessoa = new ListaContatos(nome, telefone, email);
                    String adicionado = ListaContatos.addContato(pessoa);
                    System.out.println("\nContato salvo com sucesso!\n" + adicionado);
                    break;
                case 2: //Busca contato
                    System.out.println("Busque o contato pelo nome que foi salvo: ");
                    String nomeBuscar = sc.nextLine();

                    ListaContatos buscar = new ListaContatos();
                    String resultado = ListaContatos.buscarContatos(nomeBuscar.trim());

                    if (resultado == null) {
                        System.err.println("Contato não encontrado.");
                    } else {
                        System.out.println("Contato encontrado:\n" + resultado);
                    }
                    break;
                case 3: //Finaliza
                    System.exit(0);
                    break;
                default:
                    System.err.println("Opção inválida!");
                    break;
            }
        }
    }
}
