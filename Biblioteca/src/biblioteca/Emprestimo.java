package biblioteca;

import java.util.ArrayList;

public class Emprestimo {

  
    private String livro;
    private String user;
    private String informacoesAdicionais;
    public Emprestimo() {
    }

    public Emprestimo(String user, String livro, String informacoesAdicionais) {

        this.user = user;
        this.livro = livro;
        this.informacoesAdicionais = informacoesAdicionais;
    }

   
    public String getLivro() {
        return livro;
    }

 
    public void setLivro(String livro) {
        this.livro = livro;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

  
    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

   
    public void setInformacoesAdicionais(String informacoesAdicionais) {
        this.informacoesAdicionais = informacoesAdicionais;
    }

  
}
