/*
    Sempre que passar do prazo uma punição sera gerada
 */
package biblioteca;

public class Punicao {
    private int punicoesJaSofridas; 
    private String diasSemPoderPegarLivro;
   
    public Punicao(){}
    
    public int punicao(String diasSemPoderPegarLivro, int punicoesJaSofridas){
        this.diasSemPoderPegarLivro = diasSemPoderPegarLivro;
        this.punicoesJaSofridas = punicoesJaSofridas;
     
        return punicoesJaSofridas;
    }
}
