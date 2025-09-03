import java.util.ArrayList;
public class Pedido {
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    Pedido(Cliente cliente){
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void addProdutos(Produto produto){
        produtos.add(produto);
    }

    public void informarDetalhes() {
        System.out.println("===== DETALHES DO PEDIDO =====");
        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf());
        System.out.println("Produtos comprados:");

        double total = 0;
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome());
            total += produto.getPreco();
        }

        System.out.println("Total da compra: R$ " + total);
        System.out.println("==============================");
    }


}
