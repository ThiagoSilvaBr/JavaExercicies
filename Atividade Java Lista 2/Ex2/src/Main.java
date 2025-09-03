public class Main{
    public static void main(String[] args) {

        Circulo total = new Circulo(15);

        System.out.printf("A area do raio é igual a: %.2f\n", total.calcularArea());
        System.out.printf("O perimetro do raio é igual a: %.2f\n", total.calcularPerimetro());
    }
}