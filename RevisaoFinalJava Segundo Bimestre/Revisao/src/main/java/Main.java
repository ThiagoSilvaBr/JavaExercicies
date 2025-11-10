import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ConexaoBanco conexao = new ConexaoBanco();

        while (true) {
            System.out.println("\n=== Loja ===");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Listar Itens");
            System.out.println("3. Atualizar Preço Base");
            System.out.println("4. Deletar Item");
            System.out.println("5. Sair");
            System.out.println("Escolha: ");
            int opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Tipo de item (1 - Físico, 2 - Digital): ");
                    int tipo = leitor.nextInt();
                    leitor.nextLine();
                    System.out.println("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.println("Preço base: ");
                    double preco = leitor.nextDouble();

                    if (tipo == 1) {
                        System.out.println("Peso (kg): ");
                        double peso = leitor.nextDouble();
                        ProdutoFisico pf = new ProdutoFisico(nome, preco, peso);
                        conexao.InserirItem(pf);
                    } else {
                        System.out.println("Duração (meses): ");
                        int meses = leitor.nextInt();
                        ServicoDigital sd = new ServicoDigital(nome, preco, meses);
                        conexao.InserirItem(sd);
                    }
                }

                case 2 -> {
                    List<String> itens = conexao.BuscarItem();
                    itens.forEach(System.out::println);
                }

                case 3 -> {
                    System.out.println("ID do item: ");
                    int id = leitor.nextInt();
                    System.out.println("Novo preço base: ");
                    double novoPreco = leitor.nextDouble();
                    conexao.atualizarPrecoBase(id, novoPreco);
                }

                case 4 -> {
                    System.out.println("ID do item: ");
                    int id = leitor.nextInt();
                    conexao.deletarItem(id);
                }

                case 5 -> {
                    System.out.println("Encerrando...");
                    leitor.close();
                    return;
                }

                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
