package Sistema_biblioteca;

public class Aluno extends Usuario {

    private String matricula;
    private String curso;

    public Aluno(String nome, String cpf, String email, String matricula, String curso) {
        super(nome, cpf, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString() {
        return super.toString() +
                "\nA Matricula: " + matricula +
                "\nA Curso: " + curso;
    }
}
