
package biblioteca;


public class RelatorioEmprestimo extends Emprestimo{
    private String dataEmprestimo;
    private String prazoParaDevolucao;
    private String emprestimoRelatorio;
    
    public RelatorioEmprestimo(){}
    
    public RelatorioEmprestimo(String dataEmprestimo, String prazoParaDevolucao,
                    String emprestimoRelatorio){

        this.dataEmprestimo = dataEmprestimo;
        this.prazoParaDevolucao = prazoParaDevolucao;
        this.emprestimoRelatorio = emprestimoRelatorio;
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

  
    public String getEmprestimoRelatorio() {
        return emprestimoRelatorio;
    }


    public void setEmprestimoRelatorio(String emprestimoRelatorio) {
        this.emprestimoRelatorio = emprestimoRelatorio;
    }
}

 