public class Produtos {
    private int id;
    private String nome;
    private double preco;

    public Produtos(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String toString(){
        return String.format("Id:%d - Nome:%s - Preço:%.2f", id, nome, preco);
    }
}
