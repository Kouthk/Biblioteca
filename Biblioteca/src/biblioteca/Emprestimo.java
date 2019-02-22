package biblioteca;

import java.util.ArrayList;

public class Emprestimo {

    private String dataEmprestimo;
    private String prazoParaDevolucao;
    Estudante estudante = new Estudante();
    Professor professor = new Professor();
    ArrayList<Livro> livro = new ArrayList();

    public Emprestimo() {
    }

    public Emprestimo(String dataEmprestimo, String prazoParaDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.prazoParaDevolucao = prazoParaDevolucao;
    }

     public String emprestimoAluno(Livro livro) {
        System.out.println("Digite seu RGA");
        String rgaComp = scan.nextLine();
        if (estudante.getRga().equals(rgaComp)) {
            if (livro.getNumLivrosDisponiveis() >= 1) {
                livro.setNumLivrosDisponiveis(livro.getNumLivrosDisponiveis() - 1);
                return "Livro adquirido com sucesso";
            } else {
                return "Nao temos esse livro disponivel para emprestimo";
            }
        } else {
            return "RGA invalido";

        }
    }

    public String emprestimoProfessor(Livro livro) {
        System.out.println("Digite seu ID");
        String idProfessorComp = scan.nextLine();
        if (professor.getIdProfessor().equals(idProfessorComp)) {
            if (livro.getNumLivrosDisponiveis() >= 1) {
                livro.setNumLivrosDisponiveis(livro.getNumLivrosDisponiveis() - 1);
                return "Livro adquirido com sucesso";
            } else {
                return "Nao temos esse livro disponivel para emprestimo";
            }
        } else {
            return "ID invalido";
        }
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

}
