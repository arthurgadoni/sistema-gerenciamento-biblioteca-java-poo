package Sistema_biblioteca;

public class Multa {

    private double valor;
    private boolean paga;
    private Emprestimo emprestimo;

    public Multa(Emprestimo emprestimo, int dias_atraso) {
        this.emprestimo = emprestimo;
        this.valor = dias_atraso * 2.0;
        this.paga = false;
    }

    public double getValor() {
        return valor;
    }

    public void pagarMulta() {
        paga = true;
    }

    public String toString() {
        return "A Multa do usuario: " + emprestimo.getUsuario().getNome() +
                "\nO Livro: " + emprestimo.getLivro().getTitulo() +
                "\nO Valor: R$ " + valor +
                "\nA sua esta situacao: " + (paga ? "Paga :D" : "Pendente :(");
    }
}
