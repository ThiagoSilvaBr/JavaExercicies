import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    public static void criarTabelaProdutos(){
        String sql = "create table if not exists produto(" +
                "id int auto_increment primary key," +
                "nome varchar(255) not null," +
                "preco double," +
                "quantidade int" +
                ");";

        try (Connection conexao = ConexaoBanco.getConexao();
             Statement veiculo = conexao.createStatement();
        ) {
            veiculo.execute(sql);
            System.out.println("Criado com sucesso!");


        } catch (SQLException erro) {
            System.out.println("Erro ao criar tabela.");

        }
    }

    //------------------------------------------------------------------------
    public void add(Produto produto){
        String sqlInsert = "INSERT INTO produto (nome,preco,quantidade) VALUES (?,?,?)";

        try(Connection conexao  = ConexaoBanco.getConexao();
            PreparedStatement veiculo = conexao.prepareStatement(sqlInsert)){

            veiculo.setString(1, produto.getNome());
            veiculo.setDouble(2, produto.getPreco());
            veiculo.setInt(3, produto.getQuantidade());
            veiculo.executeUpdate();
            System.out.println("Produto adicionado com sucesso");


        }catch(SQLException erro){
            System.out.println("Erro ao inserir produto");
        }
    }
    //------------------------------------------------------------------------
    public List<Produto> listarProdutos(){
        List<Produto> produtos = new ArrayList<>();
        String sqlSelect = "SELECT * FROM produto";

        try(Connection conexao = ConexaoBanco.getConexao();
            Statement veiculo = conexao.createStatement();
            ResultSet resultado = veiculo.executeQuery(sqlSelect)){

            while(resultado.next()){
                Produto produto  = new Produto();
                produto.setId(resultado.getInt("id"));
                produto.setNome(resultado.getString("nome"));
                produto.setPreco(resultado.getDouble("preco"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produtos.add(produto);
            }
        }catch (SQLException erro){
            System.out.println("Erro ao listar produtos");
        }
        return produtos;
    }
    //------------------------------------------------------------------------
    public void atualizarProduto(int id, double precoNovo){
        String sqlUpdate = "UPDATE produto SET preco = ? Where id = ?";

        try(Connection conexao  = ConexaoBanco.getConexao();
            PreparedStatement veiculo = conexao.prepareStatement(sqlUpdate)){

            veiculo.setDouble(1, precoNovo);
            veiculo.setInt(2, id);
            int linhas = veiculo.executeUpdate();

            if(linhas > 0){
                System.out.println("Produto atualizado com sucesso");
            }else{
                System.out.println("Não foi possivel encontrar o produto");
            }

        }catch(SQLException erro){
            System.out.println("Erro ao atualizar produto");
        }
    }
//------------------------------------------------------------------------
    public void excluirProduto(int id){
        String sqlDelete = "DELETE FROM produto WHERE id = ?";

        try(Connection conexao  = ConexaoBanco.getConexao();
            PreparedStatement veiculo = conexao.prepareStatement(sqlDelete)){

            veiculo.setInt(1, id);
            int deletado = veiculo.executeUpdate();

            if(deletado > 0){
                System.out.println("Produto excluido com sucesso.");
            }else{
                System.out.println("Produto não encontrado.");
            }

        }catch(SQLException erro){
            System.out.println("Erro ao atualizar deletar produto");
        }
    }
}
