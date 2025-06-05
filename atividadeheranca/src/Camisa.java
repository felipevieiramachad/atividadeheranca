public class Camisa extends Produto {
    private final String cor;
    private final String tamanho;
    private final String material;

    public Camisa(String nome, double preco, String cor, String tamanho, String material) {
        super(nome, preco);
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Exibe nome e preço
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Material: " + material);
    }
}