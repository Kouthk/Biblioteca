package biblioteca;

import java.util.ArrayList;

public class Emprestimo {

    private String dataEmprestimo;
    private String prazoParaDevolucao;
    private String professor;
    private String aluno;
    private String livro;

    public Emprestimo() {
    }

    public Emprestimo(String dataEmprestimo, String prazoParaDevolucao,
            String professor, String aluno, String livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.prazoParaDevolucao = prazoParaDevolucao;
        this.aluno = aluno;
        this.professor = professor;
        this.livro = livro;
    }

    public void devolverLivro() {

    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getPrazoParaDevolucao() {
        return prazoParaDevolucao;
    }

    public void setPrazoParaDevolucao(String prazoParaDevolucao) {
        this.prazoParaDevolucao = prazoParaDevolucao;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

}
