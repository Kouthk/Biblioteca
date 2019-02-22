package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Auxiliar {

    ArrayList<Estudante> estudantes = new ArrayList();
    ArrayList<Professor> professores = new ArrayList();
    ArrayList<Autor> autores = new ArrayList();
    ArrayList<Funcionario> funcionarios = new ArrayList();
    ArrayList<DoacaoLivro> doadores = new ArrayList();
    ArrayList<Livro> livros = new ArrayList();
    ArrayList<AreaLivro> area = new ArrayList();

    String arquivoEstudante = "estudante.bin";
    String arquivoProfessor = "professor.bin";
    String arquivoFuncionario = "funcionairo.bin";
    String arquivoDoacao = "doacao.bin";
    String arquivoLivro = "livro.bin";
    String arquivoEmprestimos = "emprestimos.bin";

    Scanner scan = new Scanner(System.in);

    // Cadastros
    public void cadastrarAluno() {

        System.out.println("----------------------------");
        System.out.println("Cadastrar Estudante \n nome:");
        String nomeAluno = scan.nextLine();
        System.out.println("Telefone: ");
        String telefoneAluno = scan.nextLine();
        System.out.println("Data de nascimento");
        String dataNascimentoAluno = scan.nextLine();
        System.out.println("RGA");
        String rga = scan.nextLine();
        System.out.println("Curso");
        String cursoAluno = scan.nextLine();
        boolean estudantePunido = false;
        System.out.println("----------------------------");
        System.out.println();
        Estudante estudante = new Estudante(nomeAluno, telefoneAluno,
                dataNascimentoAluno, rga, cursoAluno, estudantePunido);
        estudantes.add(estudante);
        System.out.println(estudante.getEstudante());
    }

    public void cadastrarProfessor() {

        System.out.println("----------------------------");
        System.out.println("Cadastrar Professor \n nome");
        String nomeProfessor = scan.nextLine();
        System.out.println("Telefone ");
        String telefoneProfessor = scan.nextLine();
        System.out.println("Data Nascimento");
        String dataNascimentoProfessor = scan.nextLine();
        System.out.println("Titulacao");
        String titulacao = scan.nextLine();
        System.out.println("ID professor");
        String idProfessor = scan.nextLine();
        System.out.println("----------------------------");
        Professor professor = new Professor(nomeProfessor, telefoneProfessor, dataNascimentoProfessor,
                titulacao, idProfessor);
        professores.add(professor);

    }

    public void cadastrarFuncionario() {

        System.out.println("----------------------------");
        System.out.println("Cadastrar Professor \n nome");
        String nomeFuncionario = scan.nextLine();
        System.out.println("Telefone ");
        String telefoneFuncionario = scan.nextLine();
        System.out.println("Data Nascimento");
        String dataNascimentoFuncionario = scan.nextLine();
        System.out.println("ID do funcionario");
        String idFuncionario = scan.nextLine();
        System.out.println("----------------------------");
        Funcionario funcionario = new Funcionario(nomeFuncionario, telefoneFuncionario,
                dataNascimentoFuncionario, idFuncionario);
        funcionarios.add(funcionario);

    }

    public void cadastrarAutor() {

        System.out.println("----------------------------");
        System.out.println("Cadastrar Autor \n nome");
        String nomeAutor = scan.nextLine();
        System.out.println("Telefone ");
        String telefoneAutor = scan.nextLine();
        System.out.println("Data Nascimento");
        String dataNascimentoAutor = scan.nextLine();
        System.out.println("Bibliografia do autor");
        String bibliografiaAutor = scan.nextLine();
        System.out.println("----------------------------");
        Autor autor = new Autor(nomeAutor, telefoneAutor, dataNascimentoAutor, bibliografiaAutor);
        autores.add(autor);
        System.out.println(autor.getAutor());

    }

    public void cadastrarDoador() {

        System.out.println("----------------------------");
        System.out.println(" Doacao \n nome doador");
        String nomeDoador = scan.nextLine();
        System.out.println("Telefone ");
        String telefoneDoador = scan.nextLine();
        System.out.println("Data Nascimento");
        String dataNascimentoDoador = scan.nextLine();
        System.out.println("Nome do livro que deseja doar");
        //Terminar essa parte, falta fazer pra colocar o titulo do livro e adicionar exemplares caso tenha na biblioteca
        // se não tiver chama a função de cadastro

        System.out.println("Digite quantos livros está doando");
        int nrmLivrosDoados = scan.nextInt();
        System.out.println("idDoacao");
        String idDoacao = scan.nextLine();
        System.out.println("----------------------------");
        DoacaoLivro doador = new DoacaoLivro(nomeDoador, telefoneDoador, dataNascimentoDoador, idDoacao, nrmLivrosDoados);
        doadores.add(doador);

    }

    public void cadastrarArea() {

    }

    public void cadastrarLivro() {

        System.out.println("----------------------------");
        System.out.println("Inserir Livro na Biblioteca");
        String titulo = scan.nextLine();
        System.out.println("Tema do livro");
        String tema = scan.nextLine();
        System.out.println("Volume");
        String volumeDoLivro = scan.nextLine();
        System.out.println("Numero de paginas");
        String numeroDePaginas = scan.nextLine();
        System.out.println("Editora");
        String editora = scan.nextLine();
        System.out.println("Autor do livro");
        String autorLivro = scan.nextLine();
        System.out.println("Numero de livros adicionado ao acervo");
        int livrosAdicionadosNaBiblioteca = scan.nextInt();
        System.out.println("----------------------------");
        Livro livro = new Livro(titulo, autorLivro, tema, livrosAdicionadosNaBiblioteca, volumeDoLivro,
                numeroDePaginas, editora);
    }

    //Litagens
    public void listarEstudantes() {
        int i = 0;

        System.out.println("----------------------------");
        System.out.println("-----Alunos Cadastrados-----");
        System.out.println("----------------------------");
        for (Estudante x : estudantes) {
            System.out.println(i + ": " + x);
            i++;
        }

    }

    public void listarProfessores() {
        int i = 0;

        System.out.println("-----------------------------");
        System.out.println("---Professores Cadastrados---");
        System.out.println("-----------------------------");
        for (Professor x : professores) {
            System.out.println(i + ": " + x);
            i++;
        }

    }

    public void listarFuncionarios() {
        int i = 0;

        System.out.println("----------------------------");
        System.out.println("------- Funcionarios -------");
        System.out.println("----------------------------");
        for (Funcionario x : funcionarios) {
            System.out.println(i + ": " + x);
            i++;
        }

    }

    public void listarLivros() {
        int i = 0;

        System.out.println("----------------------------");
        System.out.println("---------- Livros ----------");
        System.out.println("----------------------------");
        for (Livro x : livros) {
            System.out.println(i + ": " + x);
            i++;;
        }
    }

    public void listarAutores() {
        int i = 0;

        System.out.println("-----------------------------");
        System.out.println("----------- Autor -----------");
        System.out.println("-----------------------------");
        for (Autor x : autores) {
            System.out.println(i + ": " + x);
            i++;;
        }
    }

    public void listarDoadores() {
        int i = 0;
        System.out.println("----------------------------");
        System.out.println("--------- Doadores ---------");
        System.out.println("----------------------------");
        for (DoacaoLivro x : doadores) {
            System.out.println(i + ": " + x);
            i++;
        }
    }

    //Deletar dados
    public void apagarAluno() {
        listarEstudantes();
        System.out.println("Digite o numero do aluno a ser deletado");
        int op = scan.nextInt();
        estudantes.remove(op);
        System.out.println("Remoção efetuada com sucesso");
    }

    public void apagarProfessor() {
        listarProfessores();
        System.out.println("Digite o numero do Professor a ser deletado");
        int op = scan.nextInt();
        professores.remove(op);
        System.out.println("Remoção efetuada com sucesso");
    }

    public void apagarAutor() {
        listarAutores();
        System.out.println("Digite o numero do autor a ser deletado");
        int op = scan.nextInt();
        autores.remove(op);
        System.out.println("Remoção efetuada com sucesso");
    }

    public void apagarFuncionario() {
        listarFuncionarios();
        System.out.println("Digite o numero do funcionario a ser deletado");
        int op = scan.nextInt();
        funcionarios.remove(op);
        System.out.println("Remoção efetuada com sucesso");
    }

    public void apagarLivro() {
        listarLivros();
        System.out.println("Digite o numero do livro a ser deletado");
        int op = scan.nextInt();
        livros.remove(op);
        System.out.println("Remoção efetuada com sucesso");
    }

    public void apagarDoacao() {
        listarDoadores();
        System.out.println("Digite o numero do doacao a ser deletado");
        int op = scan.nextInt();
        doadores.remove(op);
        System.out.println("Remoção efetuada com sucesso");
    }

    public String emprestimo() {
        Emprestimo emprestimo = new Emprestimo();
        Estudante est = new Estudante();
        System.out.println("Livros em nosso acervo: \n");;
        listarLivros();
        System.out.println("Escolha o Livro");
        int op = scan.nextInt();
        System.out.println("Livro" + livros.get(op).getLivro() + "Selecionado");
        System.out.println("Realizar emprestimo como Aluno digite 1 como professor Digite 2");
        int opAlunoProfessor = scan.nextInt();
        switch (opAlunoProfessor) {
            case 1:
                System.out.println("Digite seu RGA");
                String rgaComp = scan.nextLine();
                for (int i = 0; i < estudantes.; i++) {
                    if (estudantes.get(i).getRga().contains(rgaComp)) {
                        if (livros.get(op).getNumLivrosDisponiveis() >= 1) {
                            livros.get(op).setNumLivrosDisponiveis(livros.get(op).getNumLivrosDisponiveis() - 1);
                        } else {
                            return "Nao temos esse livro disponivel para emprestimo";
                        }
                    } else {
                        return "RGA invalido";

                    }
                }
                break;
            case 2:
                System.out.println("Digite seu ID");
                String idProfessorComp = scan.nextLine();
                for(int i = 0; i<professores.; i++){
                if (professores.get(i).getIdProfessor().contains(idProfessorComp)) {
                    if (livros.get(op).getNumLivrosDisponiveis() >= 1) {
                        livros.get(op).setNumLivrosDisponiveis(livros.get(op).getNumLivrosDisponiveis() - 1);
                    } else {
                        return "Nao temos esse livro disponivel para emprestimo";
                    }
                } else {
                    return "ID invalido";
                }
                }
                break;
            default:
                return "Opcao invalida, falha ao adquirir livro!";
        }

    }



}
