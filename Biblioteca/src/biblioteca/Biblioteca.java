
package biblioteca;

import java.util.Scanner;


public class Biblioteca {


    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        int op = 01;
        while (op != 0){
            System.out.println("Digite uma das opções abaixo");
            System.out.println("----------------------------");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Funcionario");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Cadastrar Autor");
            System.out.println("5 - Realizar Doação");
            System.out.println("6 - Realizar emprestimo");
            System.out.println("7 - Cadastrar Livro");
            System.out.println("8 - Cadastrar Area");
            System.out.println("9 - Listar Alunos");
            System.out.println("10 - Listar Funcionarios");
            System.out.println("11 - Listar Professores");
            System.out.println("12 - Listar Autores Cadastrados");
            System.out.println("13 - Listar Doações");
            System.out.println("14 - Listar Livros");
            System.out.println("15 - Relatorio de Livro por Area");
            System.out.println("16 - Relatorio Emprestimo");
            System.out.println("17 - Devolver Livro");
            System.out.println("0 - Sair");
            
            Scanner scan = new Scanner(System.in);
            op = scan.nextInt();
           
            switch (op){
                case 1:
                     aux.cadastrarAluno();
                     break;
                case 2:
                     aux.listarEstudantes();
                     break;
                case 3:
                    aux.apagarAluno();
                     break;
                case 4:
                    aux.listarProfessores();
                    break;
                default:
                    if (op == 0){
                       System.out.println("Saindo do sistema"); 
                    } else {
                       System.out.println("Opcao invalida"); 
                    }
                    break;
            }
       }
    }
    
}
