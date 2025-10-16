public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 15.00);
        Produto produto2 = new Produto("Feijao", 10.00);

        System.out.printf("Produto:%s - Preço:%.2f\n", produto1.getNome(), produto1.getPreco());
        System.out.printf("Produto:%s - Preço:%.2f\n", produto2.getNome(), produto2.getPreco());



        System.out.printf("Preco pós imposto: %.2f\n", produto1.getPrecoComImposto());
        System.out.printf("Preco pós imposto: %.2f\n", produto2.getPrecoComImposto());

        Produto.setTaxaImposto(0.10);
        System.out.println("Nova taxa de imposto aplicada");

        System.out.printf("Preco pós imposto: %.2f\n", produto1.getPrecoComImposto());
        System.out.printf("Preco pós imposto: %.2f\n", produto2.getPrecoComImposto());
    }
}