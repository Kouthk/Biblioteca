
package biblioteca;

public class AreaLivro  extends Livro{
    private String nomeArea;
    private String temaArea;
    
    public AreaLivro(){
        super();
    }
    
    public AreaLivro(String nomeArea, String temaArea,  String titulo, String autorLivro,
            String tema,String volumeLivro, int numeroDePaginas, String editora){
        super(titulo,autorLivro,tema, volumeLivro, numeroDePaginas, editora);
        this.nomeArea = nomeArea;
        this.temaArea = temaArea;
    }
    
    public void relatorioTodasAsAreas(){
    
    }
    public void relatorioPorArea(){
    
    }
}
