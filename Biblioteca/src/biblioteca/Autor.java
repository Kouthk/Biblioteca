package biblioteca;

public class Autor extends Pessoa {

    private String bibliografiaAutor;
    private Livro livro = new Livro();

    public Autor() {
        super();
    }

    public Autor(String nome, String telefone, String dataNascimento,
            String bibliografiaAutor) {
        super(nome, telefone, dataNascimento);
        this.bibliografiaAutor = bibliografiaAutor;
    }

    public String getAutor() {
        return ("Nome: " + getNome() + " \n"
                + "Telefone: " + getTelefone() + " \n"
                + "Data de Nascimento: " + getDataNascimento() + " \n"
                + "Bibliografia: " + getBibliografiaAutor());
    }
    public String toString() {
        String user
                = "Nome: " + getNome() + " \n"
                + "Telefone: " + getTelefone() + " \n"
                + "Data de Nascimento: " + getDataNascimento() + " \n"
                + "Bibliografia: " + getBibliografiaAutor();

        return user;
    }
    public String livrosDoAutor(Livro livro) {
        if (this.getNome().equals(livro.getAutorLivro())) {
            return livro.getLivro();
        } else {
            return "";
        }

    }

    /**
     * @return the bibliografiaAutor
     */
    public String getBibliografiaAutor() {
        return bibliografiaAutor;
    }

    /**
     * @param bibliografiaAutor the bibliografiaAutor to set
     */
    public void setBibliografiaAutor(String bibliografiaAutor) {
        this.bibliografiaAutor = bibliografiaAutor;
    }

    /**
     * @return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
