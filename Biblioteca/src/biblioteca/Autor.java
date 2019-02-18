package biblioteca;

public class Autor extends Pessoa {

    public Autor() {
        super();
    }

    public Autor(String nome, String telefone, String dataNascimento,
        String bibliografia) {
        super(nome, telefone, dataNascimento);
    }
    
    public String toString() {
        String user
                = "Nome: " + getNome() + " \n"
                + "Telefone: " + getTelefone() + " \n"
                + "Data de Nascimento: " + getDataNascimento() + " \n";
        return user;
    }
}
