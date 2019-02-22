package biblioteca;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        AreaLivro aux1 = new AreaLivro();
        Auxiliar aux = new Auxiliar();
        int opMenu = 0;
        do {
            System.out.println("Digite uma das opções abaixo");
            System.out.println("----------------------------");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Funcionario");
            System.out.println("3 - Cadastrar Professor");
            System.out.println("4 - Cadastrar Autor");
            System.out.println("5 - Realizar Doação");
            System.out.println("6- Cadastrar Livro");

            System.out.println("7 - Realizar emprestimo");
            System.out.println("9 - Listar Autores");
            System.out.println("10 - Listar Doadores");
            System.out.println("11 - Listar Alunos");
            System.out.println("12 - Listar Funcionarios");
            System.out.println("13 - Listar Professores");
            System.out.println("14 - Listar Livros");
            System.out.println("14 - Relatorios de empresitmo");

            System.out.println("15 - Apagar Alunos");
            System.out.println("16 - Apagar Autor");
            System.out.println("17 - Apagar Doador");
            System.out.println("18 - Apagar Funcionairo");
            System.out.println("19 - Apagar Professor");
            System.out.println("20 - Apagar Livro");

            System.out.println("0 - Sair");

            Scanner scan = new Scanner(System.in);
            opMenu = scan.nextInt();

            switch (opMenu) {
                case 1:
                    aux.cadastrarAluno();
                    break;
                case 2:
                    aux.cadastrarFuncionario();
                    break;
                case 3:
                    aux.cadastrarProfessor();
                    break;
                case 4:
                    aux.cadastrarAutor();
                    break;
                case 5:
                    aux.cadastrarDoador();
                    break;
                case 6:
                    aux.cadastrarLivro();
                    break;
                case 7:
                    aux.emprestimo();
                    break;
                case 8:
                    aux.listarAutores();
                    break;
                case 9:
                    aux.listarDoadores();
                    break;
                case 10:
                    aux.listarEstudantes();
                    break;
                case 11:
                    aux.listarFuncionarios();
                    break;
                case 12:
                    aux.listarProfessores();
                    break;
                case 13:
                    aux.listarLivros();
                    break;
                case 14:
                    aux.listrarRelatoriosEmprestimos();
                    break;
                case 15:
                    aux.apagarAluno();
                    break;
                case 16:
                    aux.apagarAutor();
                    break;
                case 17:
                    aux.apagarDoacao();
                    break;
                case 18:
                    aux.apagarFuncionario();
                    break;
                case 19:
                    aux.apagarProfessor();
                    break;
                case 20:
                    aux.apagarLivro();
                    break;
                case 21: 
                    aux1.relatorioTodasAsAreas();
                case 22: 
                    aux1.relatorioTodasAsAreas();
                default:
                    if (opMenu == 0) {
                        System.out.println("Saindo do sistema");
                    } else {
                        System.out.println("Opcao invalida");
                    }
                    break;
            }
        } while (opMenu != 0);
    }

}
