public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int numero, String tipo, double precoPorNoite){
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.ocupado = false;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getTipo(){
        return this.tipo;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }

    public Hospede getHospedeAtual(){
        return this.hospedeAtual;
    }

    public double getPrecoPorNoite(){
        return this.precoPorNoite;
    }

    public void ocupar(Hospede hospede){
        setOcupado(true);
        setHospedeAtual(hospede);
    }

    public void liberar(){
        setOcupado(false);
        setHospedeAtual(null);
    }

    public void setHospedeAtual(Hospede hospede){
        this.hospedeAtual = hospede;
    }

    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

}