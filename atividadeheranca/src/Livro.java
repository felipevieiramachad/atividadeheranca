public class Livro extends Produto {
    private final String autor;
    private final int numeroPaginas;
    private final boolean capaDura;

    public Livro(String nome, double preco, String autor, int numeroPaginas, boolean capaDura) {
        super(nome, preco);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.capaDura = capaDura;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Exibe nome e preço
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Capa dura: " + (capaDura ? "Sim" : "Não"));
    }
}
