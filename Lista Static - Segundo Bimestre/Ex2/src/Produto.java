public class Produto {
    private String nome;
    private double preco;
    private static double taxaImposto = 0.05;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPrecoComImposto(){
        return this.preco * (1 + taxaImposto);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
