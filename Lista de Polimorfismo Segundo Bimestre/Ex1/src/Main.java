public class Main {
    public static void main(String[] args) {
    Carro carro1 = new Carro("Hyundai", "SUV");
    Moto moto1 = new Moto("BMW", "i30");

        System.out.printf("%.2f\n", carro1.calcularPedagio());
        System.out.printf("%.2f\n", moto1.calcularPedagio());
    }
}