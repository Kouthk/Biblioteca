package biblioteca;

public class Autor extends Pessoa {

    private String bibliografia;

    public Autor() {
        super();
    }

    public Autor(String nome, String telefone, String dataNascimento,
        String bibliografia) {
        super(nome, telefone, dataNascimento);
        this.bibliografia = bibliografia;      
    }
}
