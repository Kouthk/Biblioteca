
package biblioteca;

public class Livro {
    private String titulo;
    private String tema;
    private String volumeLivro;
    private int numeroDePaginas;
    private String autorLivro;    
    private String editora;
    
    public Livro(){}
    
    public Livro ( String titulo, String autorLivro, String tema,
            String volumeLivro, int numeroDePaginas, String editora){
        this.titulo = titulo;
        this.tema = tema;
        this.volumeLivro = volumeLivro;
        this.numeroDePaginas = numeroDePaginas;
        this.autorLivro = autorLivro;
        this.editora = editora;
    }


    public String getTitulo() {
        return titulo;
    }

   
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

  
    public String getTema() {
        return tema;
    }

    
    public void setTema(String tema) {
        this.tema = tema;
    }

    
    public String getVolumeLivro() {
        return volumeLivro;
    }

   
    public void setVolumeLivro(String volumeLivro) {
        this.volumeLivro = volumeLivro;
    }

  
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

 
    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

 
    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }


    public String getEditora() {
        return editora;
    }

  
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
}
