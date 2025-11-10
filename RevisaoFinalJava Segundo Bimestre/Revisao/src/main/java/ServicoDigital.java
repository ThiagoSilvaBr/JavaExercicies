public class ServicoDigital extends  ItemVendavel{
    private int duracaoMes;

    public ServicoDigital(String nome, double precoBase, int duracaoMes) {
        super(nome, precoBase);
        this.duracaoMes = duracaoMes;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * duracaoMes;
    }

    @Override
    public String getTipo() {
        return "ServicoDigital";
    }
}
