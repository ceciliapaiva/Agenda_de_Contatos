import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opt;
        String nome, telefone, email;


        System.out.println("Escolha de acordo com os números:\n1. Adicionar novo contato\n2.Buscar contato");
        opt = sc.next();

        switch (opt){
            case "1":
                System.out.println("Nome: ");
                    nome = sc.next();
                System.out.println("Telefone: ");
                    telefone = sc.nextLine();
                System.out.println("E-mail: ");
                    email = sc.nextLine();
                sc.close();
                Config.addContato(nome, telefone, email);
                break;
            case "2":

                break;
            default:
                System.err.println("Opção inválida!");
                break;
        }
    }
}
