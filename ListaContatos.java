public class ListaContatos {
    //Atributos
    String nome, tel, email;
    static ListaContatos[] contatos = new ListaContatos[50];
    // Construtor com parametros
    public ListaContatos(String nome, String tel, String email) {
        setNome(nome);
        setTel(tel);
        setEmail(email);
    }
    // Construtor sem parametros
    public ListaContatos() {}

    // Adicionar novo contato
    public static String addContato(ListaContatos pessoa){
        for(int i = 0; i < contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = pessoa;
                return contatos[i].toString();
            }
        }
        return "Não há mais espaços!";
    }

    // Verifica nome
    public static boolean verificaNome(String nome){
        char[] numeros = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int tentativas = 0;
        for (int i = 0; i < nome.length(); i++){
            char letra = nome.charAt(i);
            for (int j = 0; j < numeros.length; j++) {
                if (letra == numeros[j]) {
                    System.out.println("\nNão dígite números!\nTente novamente:\n");
                    tentativas += 1;
                    return false;
                }
            }
        }

            if (tentativas > 0){System.out.println("Agora sim (❁´◡`❁)\n");}
            return true;
    }

    // Verifica Telefone
    public static boolean verificaTel(String tel){
        int tentativas = 0;
        for (int i = 0; i < tel.length(); i++){
            char num = tel.charAt(i);
            if (!Character.isDigit(num)){
                System.out.println("\nNão dígite caracteres!\nTente novamente:\n");
                tentativas += 1;
                return false;
            }
        }
        if (tentativas > 0){System.out.println("Agora sim ƪ(˘⌣˘)ʃ\n");}
        return true;
    }

    // Verifica Email
    public static boolean verificaEmail(String email){
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (ch == '@'){
                return true;
            }
        }
        System.out.println("\nLembre-se de inserir @ no seu email.\nTente novamente:\n");
        return false;
    }

    // Buscar contatos
    public static String buscarContatos(String nome) {
        for (ListaContatos contato : contatos) {
            if (contato != null && contato.getNome().contains(nome)) {
                return contato.toString();
            }
        }
        return null;
    }

    // Imprimi a lista completa
    public static void imprimirLista(){
        for (ListaContatos lista : contatos) {
            if (lista != null) {
                System.out.println(lista.toString());
                System.out.println("_______________________________");
            }
        }
    }

    // Imprime contatos de acordo com a primeira letra
    public static void letraContato(String nome){
        char letra = nome.charAt(0);
        char primeiraLetra = 0;
        boolean encontrado = false;
        letra = Character.toLowerCase(letra);
        for (int i = 0; i < contatos.length; i++){
            if (contatos[i] != null) {
                primeiraLetra = contatos[i].getNome().charAt(0);
                primeiraLetra = Character.toLowerCase(primeiraLetra);

                if (letra == primeiraLetra) {
                    System.out.println("\n" + contatos[i].toString());
                    System.out.println("__________________________________");
                    encontrado = true;
                }
            }
        }
        if (!encontrado) {
            System.err.println("Não há nenhum contato que inicia com a letra " + nome);
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + tel + "\nEmail: " + email;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static ListaContatos[] getContatos() {
        return contatos;
    }

    public static void setContatos(ListaContatos[] contatos) {
        ListaContatos.contatos = contatos;
    }
}
