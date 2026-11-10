package Sistema_biblioteca;

public class Emprestimo {

    private Livro livro;
    private Usuario usuario;
    private String data_emprestimo;
    private String data_devolucao;
    private String status;

    public Emprestimo(Livro livro, Usuario usuario, String data_emprestimo, String data_devolucao) {
        this.livro = livro;
        this.usuario = usuario;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
        this.status = "Ativo";

        livro.retirarLivro();
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getStatus() {
        return status;
    }

    public void encerrarEmprestimo() {
        if (status.equals("Ativo")) {
            status = "Finalizado";
            livro.devolverLivro();
        }
    }

    public String toString() {
        return "O Livro: " + livro.getTitulo() +
                "\nO Usuario: " + usuario.getNome() +
                "\nA Data do emprestimo: " + data_emprestimo +
                "\nA Data prevista: " + data_devolucao +
                "\nO Status: " + status;
    }
}
