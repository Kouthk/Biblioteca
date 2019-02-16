package biblioteca;

public class Estudante extends Pessoa {

    private String rga;
    private String curso;
    
    public Estudante() {
        super();
    }

    public Estudante(String nome, String telefone,String dataNascimento,
            String rga, String curso) {
        super(nome, telefone, dataNascimento);
        this.rga = rga;
        this.rga = curso;
    }

}
