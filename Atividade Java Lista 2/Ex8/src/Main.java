public class Main {
    public static void main(String[] args) {

        Cliente pedrinho = new Cliente("Pedrinho", "123.123.123-32");
        Cliente marcelinho = new Cliente("Marcelinho", "123.123.123-32");
        Cliente cleitinho = new Cliente("Cleitinho", "123.123.123-32");

        Produto pao = new Produto("Pão frances",5.99);
        Produto gelatina = new Produto("gelatina",7.99);
        Produto arroz = new Produto("arroz",2.99);
        Produto feijao = new Produto("Feijão",4.99);

        Pedido pedido1 = new Pedido(pedrinho);
        pedido1.addProdutos(pao);
        pedido1.addProdutos(arroz);
        pedido1.addProdutos(feijao);

        Pedido pedido2 = new Pedido(marcelinho);
        pedido2.addProdutos(gelatina);
        pedido2.addProdutos(arroz);
        pedido2.addProdutos(feijao);

        Pedido pedido3 = new Pedido(cleitinho);
        pedido3.addProdutos(gelatina);

        pedido1.informarDetalhes();
        pedido2.informarDetalhes();
        pedido3.informarDetalhes();




    }
}