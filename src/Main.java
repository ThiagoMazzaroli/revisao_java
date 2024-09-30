public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto(9.90, 55, "Bolacha");

        produto.adicionarEstoque(10);
        produto.mostrarProduto();


    }
}