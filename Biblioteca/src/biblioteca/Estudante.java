package biblioteca;

public class Estudante extends Pessoa {

    private String rga;
    private String curso;
    private boolean punidoAtraso;

    public Estudante() {
        super();
    }

    public Estudante(String nome, String telefone, String dataNascimento,
            String rga, String curso, boolean punidoAtraso) {
        super(nome, telefone, dataNascimento);
        this.rga = rga;
        this.curso = curso;
        this.punidoAtraso = punidoAtraso;
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
                + "Curso" + getCurso() + " \n";

        return user;
    }

    /**
     * @return the punidoAtraso
     */
    public boolean isPunidoAtraso() {
        return punidoAtraso;
    }

    /**
     * @param punidoAtraso the punidoAtraso to set
     */
    public void setPunidoAtraso(boolean punidoAtraso) {
        this.punidoAtraso = punidoAtraso;
    }

}
