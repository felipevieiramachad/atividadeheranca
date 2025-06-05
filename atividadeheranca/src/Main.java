public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", 59.90, "J.R.R. Tolkien", 1178, true);
        Camisa camisa = new Camisa("Camisa Polo", 79.90, "Azul", "M", "Algodão");

        System.out.println("=== Informações do Livro ===");
        livro.exibirInfo();

        System.out.println("\n=== Informações da Camisa ===");
        camisa.exibirInfo();
    }
}