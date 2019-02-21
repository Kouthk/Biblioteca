package biblioteca;

public class AreaLivro {

    private String nomeArea;
    private String temaArea;

    Livro livro = new Livro();

    public AreaLivro() {
    }

    public AreaLivro(String nomeArea, String temaArea) {
        this.nomeArea = nomeArea;
        this.temaArea = temaArea;
    }

    public void relatorioTodasAsAreas() {

    }

    public String relatorioPorArea(Livro livro, String temaArea) {
        if (this.temaArea.equals(livro.getTema())) {
            return livro.getLivro();
        } else {
            return "";
        }
    }
}
