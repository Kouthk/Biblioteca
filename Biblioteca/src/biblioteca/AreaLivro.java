package biblioteca;

import java.util.ArrayList;

public class AreaLivro {

    private String nomeArea;
    private String AssuntoArea;

    ArrayList<Livro> livros = new ArrayList<>();

    public AreaLivro() {
    }

    public AreaLivro(String nomeArea, String temaArea) {
        this.nomeArea = nomeArea;
        this.AssuntoArea = temaArea;
    }

    public String getNomeArea() {
		return nomeArea;
	}

	public void setNomeArea(String nomeArea) {
		this.nomeArea = nomeArea;
	}

	public String getTemaArea() {
		return AssuntoArea;
	}

	public void setTemaArea(String temaArea) {
		this.AssuntoArea = temaArea;
	}

	public void relatorioTodasAsAreas() {

    }

    public String relatorioPorArea(Livro livro, String temaArea) {
        if (this.AssuntoArea.equals(livro.getTema())) {
            return livro.getLivro();
        } else {
            return "";
        }
    }
}