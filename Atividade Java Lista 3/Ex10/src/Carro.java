public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setAcelerar(int incrementar){
        if(incrementar+velocidadeAtual <= 180){
            this.velocidadeAtual = incrementar+velocidadeAtual;
            System.out.println("O carro acelerou com sucesso. Atualmente esta em uma velocidade de "+ velocidadeAtual);
        }else{
            System.out.println("Não foi possivel acelerar, pois a velocidade maxima é igual a 180km/h.");
        }
    }

    public void setFrear(int decremento){
        if(velocidadeAtual-decremento >= 0){
            this.velocidadeAtual = velocidadeAtual-decremento;
            System.out.println("O carro diminuiu sua velocidade com sucesso.Atualmente esta em uma velocidad de "+ velocidadeAtual);
        }else{
            System.out.println("Não é possivel que o carro tenha uma velocidade negativa.");
        }
    }
}
