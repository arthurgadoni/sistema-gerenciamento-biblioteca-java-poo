package Sistema_biblioteca;

public class Programa {
        public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro_01 = new Livro("Java para Iniciantes :D", "Deitel", "12345", 2022, 3);
        Livro livro_02 = new Livro("Logica de Programacao", "Benicio da Silva", "67679", 2023, 2);
        biblioteca.cadastrar_livro(livro_01);
        biblioteca.cadastrar_livro(livro_02);

        Aluno aluno_01 = new Aluno("Arthur", "12345678967", "arthur@email.com", "20260201", "Ciencias da computacao");

        Professor professor_01 = new Professor("Daniel", "90766932167", "daniel@email.com", "Computacao", "123456");

        biblioteca.cadastrar_usuario(aluno_01);
        biblioteca.cadastrar_usuario(professor_01);

        Emprestimo emprestimo_01 = new Emprestimo(
                livro_01,
                aluno_01,
                "10/11/2026",
                "17/11/2026"
        );

        biblioteca.realizar_emprestimo(emprestimo_01);

        Multa multa_01 = new Multa(emprestimo_01, 3);

        System.out.println("===== BIBLIOTECA =====");

        System.out.println("\n===== LIVROS CADASTRADOS =====");
        biblioteca.listar_livros();

        System.out.println("\n===== USUARIOS CADASTRADOS =====");
        biblioteca.listarUsuarios();

        System.out.println("\n===== EMPRESTIMOS ATIVOS =====");
        biblioteca.listarEmprestimos();

        System.out.println("\n===== MULTA =====");
        System.out.println(multa_01);

    }
}
