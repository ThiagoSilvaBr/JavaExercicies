public class Carro extends Veiculo{
    private int numerosDePortas;

    public Carro(String marca, String modelo, int ano, int numerosDePortas) {
        super(marca, modelo, ano);
        this.numerosDePortas = numerosDePortas;
    }

    @Override
    public String toString(){
        return String.format("%s - NumeroPortas:%d\n", super.toString(), numerosDePortas);
    }
}
