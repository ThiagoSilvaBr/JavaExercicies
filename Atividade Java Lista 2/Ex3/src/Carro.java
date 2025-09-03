public class Carro {
    private String marca;
    private String modelo;
    public Motor motor;

    Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo= modelo;
        this.motor = motor;
    }

    public void exibirDetalhes(){
        System.out.printf("A marca do carro é: %s\n", marca);
        System.out.printf("O  modelo do carro é: %s\n", modelo);
        System.out.printf("A potencia do carro é de: %s\n", motor.getPotencia());
        System.out.printf("O tipo do combustivel do carro é: %s\n", motor.gettipoCombustivel());

    }

}
