public class ProdutoFisico extends ItemVendavel implements Tributo{
    private double pesoEmKg;

    public ProdutoFisico(String nome, double precoBase, double pesoEmKg) {
        super(nome, precoBase);
        this.pesoEmKg = pesoEmKg;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + (pesoEmKg*3.50);
    }

    @Override
    public String getTipo() {
        return "ProdutoFisico";
    }

    @Override
    public double calcularImposto() {
        return getPrecoBase() * 0.05;
    }
}
