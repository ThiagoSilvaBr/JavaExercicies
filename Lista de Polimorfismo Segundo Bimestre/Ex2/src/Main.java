public class Main {
    public static void main(String[] args) {
    Cachorro cachorro1 = new Cachorro("Mili");
    Gato gato1 = new Gato("Milk");

        System.out.printf("O animal faz %s\n", cachorro1.emitirSom());
        System.out.printf("O animal faz %s", gato1.emitirSom());
    }
}