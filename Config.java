
public class Config {
    //Atributos
    private String nome, tel, email;
    static String[] contatos = new String[50];

    // Construtor
    public Config(String nome, String tel, String email) {
        this.nome = nome;
        this.tel = tel;
        this.email = email;
    }

    public static void addContato(String nome, String tel, String email){
        Config novoContato = new Config(nome, tel, email);

        for(int i = 0; i < contatos.length; i++){
            if (contatos[i] == null){
                contatos[i] = novoContato.toString();
                System.out.println("\nContato adicionado com sucesso!");
                System.out.println("\nContato adicionado: \n" + contatos[i]);
                break;
            }else{
                System.err.println("Infelizmente seu espaço foi esgotado.");
                System.exit(1);
            }
        }
    }

    // Setters e getters
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

    public static String[] getContatos() {
        return contatos;
    }

    public static void setContatos(String[] contatos) {
        Config.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + tel + "\nEmail: " + email;
    }
}
