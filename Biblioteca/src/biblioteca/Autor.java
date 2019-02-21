package biblioteca;

public class Autor extends Pessoa {

    Livro livro = new Livro();

    public Autor() {
        super();
    }

    public Autor(String nome, String telefone, String dataNascimento,
            String bibliografia) {
        super(nome, telefone, dataNascimento);
    }

    public String getAutor () {
        return ("Nome: " + getNome() + " \n"
                + "Telefone: " + getTelefone() + " \n"
                + "Data de Nascimento: " + getDataNascimento() + " \n");
    }

    public String livrosDoAutor(Livro livro) {
        if (this.getNome().equals(livro.getAutorLivro())) {
            return livro.getLivro();
        } else {
            return "";
        }

    }
}
