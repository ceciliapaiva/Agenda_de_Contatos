public class ListaContatos {
    //Atributos
    String nome, tel, email;
    static ListaContatos[] contatos = new ListaContatos[50];
    // Construtor
    public ListaContatos(String nome, String tel, String email) {
        setNome(nome);
        setTel(tel);
        setEmail(email);
    }
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

    // Buscar contatos
    public static String buscarContatos(String nome) {
        for (ListaContatos contato : contatos) {
            if (contato != null && contato.getNome().contains(nome)) {
                return contato.toString();
            }
        }
        return null;
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
