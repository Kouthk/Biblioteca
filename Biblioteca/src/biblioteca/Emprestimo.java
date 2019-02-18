
package biblioteca;

public class Emprestimo {
    private String dataEmprestimo;
    private String prazoParaDevolucao;
    private boolean alunoProfessor; 
    
    public Emprestimo(){}
    
    public Emprestimo(String dataEmprestimo, String prazoParaDevolucao){
        this.dataEmprestimo = dataEmprestimo;
        this.prazoParaDevolucao = prazoParaDevolucao;
    }
    
    public void realizarEmprestimo(){
        
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


    public boolean isAlunoProfessor() {
        return alunoProfessor;
    }

    /**
     * @param alunoProfessor the alunoProfessor to set
     */
    public void setAlunoProfessor(boolean alunoProfessor) {
        this.alunoProfessor = alunoProfessor;
    }
    
}
