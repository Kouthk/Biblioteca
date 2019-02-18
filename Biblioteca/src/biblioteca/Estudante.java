package biblioteca;

public class Estudante extends Pessoa {

    private String rga;
    private String curso;

    public Estudante() {
        super();
    }

    public Estudante(String nome, String telefone, String dataNascimento,
            String rga, String curso) {
        super(nome, telefone, dataNascimento);
        this.rga = rga;
        this.rga = curso;
    }

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String toString() {
        String user
                = "Nome: " + getNome() + " \n"
                + "Telefone: " + getTelefone() + " \n"
                + "Data de Nascimento: " + getDataNascimento() + " \n"
                + "RGA: " + getRga() + " \n"
                + "Curso" + getCurso() + " \n";

        return user;
    }

}
