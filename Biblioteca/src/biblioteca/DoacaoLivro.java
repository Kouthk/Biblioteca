
package biblioteca;


public class DoacaoLivro extends Pessoa {
    private String idDoacao;
    private int numeroExemplaresDoados;
    
     public DoacaoLivro(){
        super();
    }
    
    public DoacaoLivro(String nome, String telefone, String dataNascimento,
            String idDoacao, int numeroExemplaresDoados){
        super(nome, telefone, dataNascimento);
        this.idDoacao = idDoacao;
        this.numeroExemplaresDoados = numeroExemplaresDoados;
    }
}
