public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", 10);
        Produto produto2 = new Produto("Feijão", 12);
        Produto produto3 = new Produto("Carne", 35);

        System.out.println("O produto "+ produto1.getNome()+ " custa: "+ produto1.getPreco());
        System.out.println("O produto "+ produto2.getNome()+ " custa: "+ produto2.getPreco());
        System.out.println("O produto "+ produto3.getNome()+ " custa: "+ produto3.getPreco());

        System.out.println("============================================");

        produto1.setPreco(8);
        produto2.setPreco(0);
        produto3.setPreco(15);

        System.out.println("O produto "+ produto1.getNome()+ " custa: "+ produto1.getPreco());
        System.out.println("O produto "+ produto2.getNome()+ " custa: "+ produto2.getPreco());
        System.out.println("O produto "+ produto3.getNome()+ " custa: "+ produto3.getPreco());
    }
}