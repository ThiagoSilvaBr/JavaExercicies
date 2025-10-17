public class Eletronico extends Produtos {
    private int voltagem;
    private int garantiaEmMeses;

    public Eletronico(int id, String nome, double preco, int voltagem, int garantiaEmMeses) {
        super(id, nome, preco);
        this.voltagem = voltagem;
        this.garantiaEmMeses = garantiaEmMeses;
    }

    @Override
    public String toString(){
        return String.format("%s - Voltagem:%d - GarantiaEmMeses:%d", super.toString(),
                voltagem, garantiaEmMeses );
    }
}
