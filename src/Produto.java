public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(double preco, int quantidade, String nome) {
        this.preco = preco;
        this.quantidadeEstoque = quantidade;
        this.nome = nome;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade <= 0){
            System.out.println("adicione um valor aceitavel");
        } else {
            quantidadeEstoque += quantidade;
        }
    }
    public void mostrarProduto(){
        System.out.println("Nome do produto: " + this.getNome());
        System.out.println("Qantidade do produto: " + this.getQuantidadeEstoque());
        System.out.print("Valor total em estoque: ");
        calcularValorTotalEstoque();
    }

    public void removerEstoque(int quantidade){
        if(quantidade <= 0){
            System.out.println("adicione um valor aceitavel");
        } else {
            quantidadeEstoque -= quantidade;
            System.out.println("Quantidade no estoque: " + quantidadeEstoque);
        }
    }

    public void calcularValorTotalEstoque(){

        for (int i = 1; i <= quantidadeEstoque; i++){

            double valorTotal = i * preco;
            if (i == quantidadeEstoque){
                System.out.println(valorTotal);
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

}
