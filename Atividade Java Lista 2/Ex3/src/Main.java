public class Main{
    public static void main(String[] args) {

        Motor motor = new Motor("V8","Diesel");
        Carro celta = new Carro("Chevrolet", "2008", motor);

        celta.exibirDetalhes();


    }
}