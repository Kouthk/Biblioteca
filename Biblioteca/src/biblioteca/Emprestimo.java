
package biblioteca;

public class Emprestimo {
    private String dataEmprestimo;
    private String prazoParaDevolucao;
    Estudante estudante = new Estudante();
    Professor professor = new Professor();
    
    public Emprestimo(){}
    
    public Emprestimo(String dataEmprestimo, String prazoParaDevolucao){
        this.dataEmprestimo = dataEmprestimo;
        this.prazoParaDevolucao = prazoParaDevolucao;
    }
    
    public String realizarEmprestimo(){
        if(estudante.isPunidoAtraso()){
            return "Punido por atraso, não pode realizar emprestimo até que um funcionario retire sua punição";
        }else{
            
        }
        
    }
    
    public void devolverLivro (){
    
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
