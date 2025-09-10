public class Main{
    public static void main(String[] args) {
        Livro livro1 = new Livro("Os tres porquinhos", "Joseph Jacobs");
        Livro livro2 = new Livro("Sítio do pica-pau amarelo", "Monteiro Lobato");
        Livro livro3 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");

        CarrinhoDeCompra carrinho1 = new CarrinhoDeCompra();

        carrinho1.adicionarItem(livro1);
        carrinho1.adicionarItem(livro2);
        carrinho1.adicionarItem(livro3);

        carrinho1.listar();

        carrinho1.removerItem(livro2);
        System.out.println("-------------Item removido!-------------");
        carrinho1.listar();
        carrinho1.calcularTotal();
    }
}