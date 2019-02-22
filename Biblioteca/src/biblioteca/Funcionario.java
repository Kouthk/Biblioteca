
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
    
    public String getFuncionario() {
        return(  "Nome: " + getNome() + " \n"
                + "Telefone: " + getTelefone() + " \n"
                + "Data de Nascimento: " + getDataNascimento() + " \n");
    }
    public String toString() {
        String user
                = "Nome: " + getNome() + " \n"
                + "Telefone: " + getTelefone() + " \n"
                + "Data de Nascimento: " + getDataNascimento() + " \n";

        return user;
    }
    private void apagarUsuario(){}
    private void apagarLivro (){}
    private void retirarPunicao(){}

    /**
     * @return the idFuncionario
     */
    public String getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
        
}
