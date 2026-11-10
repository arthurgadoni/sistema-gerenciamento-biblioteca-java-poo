package Sistema_biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void cadastrar_livro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrar_usuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizar_emprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void listar_livros() {
        for (Livro livro : livros) {
            System.out.println(livro);
            System.out.println("-------------------");
        }
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
            System.out.println("-------------------");
        }
    }

    public void listarEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getStatus().equals("Ativo")) {
                System.out.println(emprestimo);
                System.out.println("-------------------");
            }
        }
    }
}
