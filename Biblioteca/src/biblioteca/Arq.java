
package biblioteca;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Arq {
    //leituras
     public static ArrayList<Estudante> lerArquivoEstudante(String arquivo) {
        ArrayList<Estudante> estudantes = new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        Estudante x;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((x = (Estudante) in.readObject()) != null) {
                estudantes.add(x);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return estudantes;
    }
     
         public static ArrayList<Professor> lerArquivoProfessor(String arquivo) {
        ArrayList<Professor> professores = new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        Professor x;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((x = (Professor) in.readObject()) != null) {
                professores.add(x);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return professores;
    }

    public static ArrayList<Funcionario> lerArquivoFuncionario(String arquivo) {
        ArrayList<Funcionario> funcionarios= new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        Funcionario x;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((x = (Funcionario) in.readObject()) != null) {
                funcionarios.add(x);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return funcionarios;
    }
    
    public static ArrayList<DoacaoLivro> lerArquivoDoacaoLivro(String arquivo) {
        ArrayList<DoacaoLivro> doadores= new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        DoacaoLivro x;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((x = (DoacaoLivro) in.readObject()) != null) {
                doadores.add(x);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return doadores;
    }
    
     public static ArrayList<RelatorioEmprestimo> lerArquivoRelatorioEmprestimo(String arquivo) {
        ArrayList<RelatorioEmprestimo> relatoriosEmprestimos= new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        RelatorioEmprestimo x;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((x = (RelatorioEmprestimo) in.readObject()) != null) {
                relatoriosEmprestimos.add(x);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return relatoriosEmprestimos;
    }
     
     public static ArrayList<Autor> lerArquivoAutor(String arquivo) {
        ArrayList<Autor> autores = new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        Autor x;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((x = (Autor) in.readObject()) != null) {
                autores.add(x);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return autores;
    }
     
      public static ArrayList<Livro> lerArquivoLivro(String arquivo) {
        ArrayList<Livro> livros = new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        Livro x;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((x = (Livro) in.readObject()) != null) {
                livros.add(x);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return livros;
    } 
      
    // escreve nos arquivos
    public static void escreverArquivoEstudante(ArrayList<Estudante> estudantes, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(Estudante x: estudantes)
                out.writeObject(x);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void escreverArquivoProfessor(ArrayList<Professor> professores, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(Professor x: professores)
                out.writeObject(x);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
     public static void escreverArquivoAutor(ArrayList<Autor> autores, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(Autor x: autores)
                out.writeObject(x);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void escreverArquivoFuncionario(ArrayList<Funcionario> funcionarios, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(Funcionario x: funcionarios)
                out.writeObject(x);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
     public static void escreverArquivoRelatorioEmprestimo(ArrayList<RelatorioEmprestimo> relatoriosEmprestimos, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(RelatorioEmprestimo x: relatoriosEmprestimos)
                out.writeObject(x);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
     
      public static void escreverArquivoLivro(ArrayList<Livro> livros, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(Livro x: livros)
                out.writeObject(x);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
      
        public static void escreverArquivoDoacaoLivro(ArrayList<DoacaoLivro> doadores, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(DoacaoLivro x: doadores)
                out.writeObject(x);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
