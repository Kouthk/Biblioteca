
package biblioteca;


public class Professor extends Pessoa{
    private String titulacao;
    private String idProfessor;
    
    public Professor(){
        super();
    }
    
    public Professor(String nome, String telefone, String dataNascimento,
            String titulacao, String idProfessor){
        super(nome, telefone, dataNascimento);
        this.titulacao = titulacao;
        this.idProfessor = idProfessor;
    }
    
}
