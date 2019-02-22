
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


    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getIdProfessor() {
        return idProfessor;
    }

 
    public void setIdProfessor(String idProfessor) {
        this.idProfessor = idProfessor;
    }
     public String getProfessor() {
        return( "Nome: " + getNome() + " \n"
                + "Telefone: " + getTelefone() + " \n"
                + "Data de Nascimento: " + getDataNascimento() + " \n"
                + "Titulação: " + getTitulacao() + " \n");
    }
     
    public String toString() {
        String user
                = "Nome: " + getNome() + " \n"
                + "Telefone: " + getTelefone() + " \n"
                + "Data de Nascimento: " + getDataNascimento() + " \n"
                + "Titulação: " + getTitulacao() + " \n";

        return user;
    }
}
