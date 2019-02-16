
package biblioteca;


public class Funcionario extends Pessoa{
    private String idFuncionario;
    
    public Funcionario(){
        super();
    }
    
    public Funcionario(String nome, String telefone, String dataNascimento,
           String idFuncionario){
        super(nome, telefone, dataNascimento);
        this.idFuncionario = idFuncionario;
    }   
    
    private void apagarUsuario(){}
    private void apagarLivro (){}
    private void retirarPunicao(){}
        
}
