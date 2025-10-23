public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(4);
        Quadrado quadrado1 = new Quadrado(20);

        System.out.printf("A area é:%.2f\n", circulo1.calcularArea());
        System.out.printf("A area é:%.2f", quadrado1.calcularArea());
    }
}