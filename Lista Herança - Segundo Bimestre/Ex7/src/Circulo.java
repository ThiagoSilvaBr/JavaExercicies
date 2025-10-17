public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public String toString(){
        return String.format("%s - Raio:%.2f\n", super.toString(), raio);
    }
}
