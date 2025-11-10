import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConexaoBanco {
    private static final String host = "jdbc:h2:./revisaocomercio_db";
    private static final String usuario = "sa";
    private static final String senha = "";

    public ConexaoBanco() {
        criarTabela();
    }

    private void criarTabela(){
        String sqlCriar =
                     "CREATE TABLE IF NOT EXISTS item (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY," +
                        "nome VARCHAR(255) NOT NULL, " +
                        "preco_base DOUBLE," +
                        "tipo VARCHAR(50)," +
                        "preco_final DOUBLE," +
                        "imposto DOUBLE " +
                     ");";

        try (Connection conexao = DriverManager.getConnection(host, usuario, senha);
             Statement veiculo = conexao.createStatement()) {
            veiculo.execute(sqlCriar);
        } catch (SQLException erro) {
            System.out.println("Erro ao criar tabela.");
        }
    }
//---------------------------------------------------------------------------------
    public void InserirItem(ItemVendavel item){
        String sqlInserir = "INSERT INTO item (nome, preco_base, tipo, preco_final, imposto) VALUES (?, ?, ?, ?, ?)";

        try (Connection conexao = DriverManager.getConnection(host, usuario, senha);
             PreparedStatement veiculo = conexao.prepareStatement(sqlInserir)){
            veiculo.setString(1, item.getNome());
            veiculo.setDouble(2, item.getPrecoBase());
            veiculo.setString(3, item.getTipo());
            veiculo.setDouble(4, item.calcularPrecoFinal());
            veiculo.setDouble(5, item.calcularImposto());
            veiculo.executeUpdate();
        } catch (SQLException erro) {
            erro.printStackTrace();
        }
    }
//---------------------------------------------------------------------------------
    public List<String> BuscarItem(){
        List<String> itens = new ArrayList<>();
        String sqlBuscar = "SELECT * FROM item";
        try (Connection conexao = DriverManager.getConnection(host, usuario, senha);
             Statement veiculo = conexao.createStatement();
             ResultSet resultado = veiculo.executeQuery(sqlBuscar)) {
            while (resultado.next()){
                itens.add(String.format(
                        "ID: %d | Nome: %s | Tipo: %s | Base: %.2f | Final: %.2f | Imposto: %.2f",
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("tipo"),
                        resultado.getDouble("preco_base"),
                        resultado.getDouble("preco_final"),
                        resultado.getDouble("imposto")
                ));
            }
        }catch (SQLException erro){
            System.out.println("Erro ao buscar itens a tabela.");
        }
        return itens;
    }
//---------------------------------------------------------------------------------
    public void atualizarPrecoBase(int id, double novoPrecoBase){
        String sqlUpdate = "UPDATE item SET preco_base = ? WHERE id = ?";

        try (Connection conexao = DriverManager.getConnection(host, usuario, senha);
             PreparedStatement veiculo = conexao.prepareStatement(sqlUpdate)) {
            veiculo.setDouble(1, novoPrecoBase);
            veiculo.setInt(2, id);
            veiculo.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao Atualizar itens da tabela.");
        }
    }
//---------------------------------------------------------------------------------
public void deletarItem(int id) {
    String sql = "DELETE FROM item WHERE id = ?";
    try (Connection conexao = DriverManager.getConnection(host, usuario, senha);
         PreparedStatement veiculo = conexao.prepareStatement(sql)) {
        veiculo.setInt(1, id);
        veiculo.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Erro ao DELETAR itens da tabela.");
    }
    }
}
