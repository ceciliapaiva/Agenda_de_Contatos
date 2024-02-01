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

    // Adiciona novo contato
    public static ListaContatos addContato(ListaContatos pessoa){
        int posicaoLivre = 0;
        for(int i = 0; i < contatos.length; i++) {
            if (contatos[i] != null) {
                posicaoLivre += (i + 1);
            } else if (contatos[contatos.length - 1] != null) {
                System.err.println("Infelizmente seu espaço foi esgotado.");
            }
        }
        contatos[posicaoLivre] = pessoa;
        System.out.println("Contato adicionado com sucesso!");
        return contatos[posicaoLivre];
    }

    // Buscar contatos
    public static ListaContatos buscarContatos(String nome) {
        for (ListaContatos contato : contatos) {
            if (contato != null && contato.getNome().equals(nome)) {
                return contato;
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
