import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {

        try(Connection conexao = ConexaoBanco.getConexao()){

        }catch (SQLException erro){
            System.out.println("Não foi possivel fazer conexao com o banco.");
        }

        Produto produto = new Produto();


        ProdutoDAO.criarTabelaProdutos();
        ProdutoDAO DAO = new ProdutoDAO();
        Scanner escreva = new Scanner(System.in);

        int op;

        do{
            System.out.println("\n=== MENU ESTOQUE ===");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Todos");
            System.out.println("3. Atualizar Preço");
            System.out.println("4. Deletar Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");
            op = escreva.nextInt();
            escreva.nextLine();

            switch(op){
                case 1 -> {
                    System.out.println("Nome:");
                    String nome = escreva.nextLine();
                    System.out.println("Preco:");
                    double preco = escreva.nextDouble();
                    System.out.println("Quantidade:");
                    int quantidade = escreva.nextInt();
                    DAO.add(new Produto(nome, preco, quantidade));
                }
                case 2 -> {
                    List<Produto> produtos = DAO.listarProdutos();
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos.");
                    }else{
                        for(Produto produto_: produtos){
                            System.out.printf("id:%d / Nome:%s / Preço:%.2f/ Quantidade:%d\n",
                                    produto_.getId(), produto_.getNome(), produto_.getPreco(), produto_.getQuantidade());
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Id do produto:");
                    int id = escreva.nextInt();
                    System.out.println("Novo preço: ");
                    double precoNovo = escreva.nextDouble();
                    DAO.atualizarProduto(id, precoNovo);
                }
                case 4 -> {
                    System.out.println("Id do produto que deseja deletar: ");
                    int idExcluir = escreva.nextInt();
                    DAO.excluirProduto(idExcluir);
                }
                case 5 -> System.out.println("Desligando...");
                default -> System.out.println("Opção invalida");
            }
        }while(op !=5);

        escreva.close();
    }

}