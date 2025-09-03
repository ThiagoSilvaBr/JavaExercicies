public class Termostato {
    private double temperaturaAtual;
    private double temperaturaDesejada;

    public Termostato(double temperaturaAtual, double temperaturaDesejada) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public double getTemperaturaAtual() {
        return this.temperaturaAtual;
    }

    public double getTemperaturaDesejada() {
        return this.temperaturaDesejada;
    }

    public void setTemperaturaDesejada(double temperaturaDesejada){
        if(temperaturaDesejada > 15 && temperaturaDesejada < 30){
            this.temperaturaDesejada = temperaturaDesejada;
            System.out.println("A nova temperatura desejada é:"+ temperaturaDesejada);
        }else{
            System.out.println("A temperatuda desejada não pode ser maior que 30 e nem menor que 15");
        }
    }

}
