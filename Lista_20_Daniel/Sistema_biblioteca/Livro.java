package Sistema_biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int ano_publicacao;
    private int quantidade_disponivel;

    public Livro(String titulo, String autor, String isbn, int ano_publicacao, int quantidade_disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ano_publicacao = ano_publicacao;
        this.quantidade_disponivel = quantidade_disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidade_disponivel() {
        return quantidade_disponivel;
    }

    public void retirarLivro() {
        if (quantidade_disponivel > 0) {
            quantidade_disponivel--;
        }
    }

    public void devolverLivro() {
        quantidade_disponivel++;
    }

    public String toString() {
        return "O Livro: " + titulo +
                "\nO Autor: " + autor +
                "\nO ISBN: " + isbn +
                "\nO Ano: " + ano_publicacao +
                "\nOs Disponiveis: " + quantidade_disponivel;
    }
}
