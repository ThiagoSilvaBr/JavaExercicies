public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 15.00);

        System.out.printf("Produto:%s - Preço:%.2f\n", produto1.getNome(), produto1.getPreco());
        System.out.printf("Preco pós imposto: %.2f\n", produto1.getPrecoComImposto());
    }
}