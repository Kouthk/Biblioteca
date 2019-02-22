
package biblioteca;


public class RelatorioEmprestimo extends Emprestimo{
    private String dataEmprestimo;
    private String prazoParaDevolucao;     
    
    public RelatorioEmprestimo(){}
    
    public RelatorioEmprestimo(String dataEmprestimo, String prazoParaDevolucao,
                String professor, String aluno, String livro){
        super(professor, aluno, livro);
        this.dataEmprestimo = dataEmprestimo;
        this.prazoParaDevolucao = prazoParaDevolucao;
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

 