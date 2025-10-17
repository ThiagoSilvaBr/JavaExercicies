public class Movel extends Produtos{
    private String material;
    private String cor;

    public Movel(int id, String nome, double preco, String material, String cor) {
        super(id, nome, preco);
        this.material = material;
        this.cor = cor;
    }

    @Override
    public String toString(){
        return String.format("%s - Material:%s - Cor:%s", super.toString(),
           material, cor);
    }
}
