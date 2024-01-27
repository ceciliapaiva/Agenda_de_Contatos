import java.util.Scanner;
public class Agenda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String nome, telefone, email;

        while (opt != '3'){
            System.out.println("\nEscolha de acordo com os números:\n1. Adicionar novo contato\n2. Buscar contato\n3. Sair");
            opt = (char)sc.nextInt();
            switch (opt){
                case 1:
                    System.out.println("Nome: ");
                        nome = sc.nextLine();
                        nome = sc.nextLine();
                    System.out.println("Telefone: ");
                        telefone = sc.nextLine();
                    System.out.println("E-mail: ");
                        email = sc.nextLine();
                    // Verificar variáveis AQUI...

                    Config.addContato(nome, telefone, email);
                    break;
                case 2:

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
