import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static Connection getConexao() {

        String local = "jdbc:mysql://localhost:3306/java_lista";
        String usuario = "root";
        String senha = "";

        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(local, usuario, senha);
            System.out.println("Conectado com sucesso!");
        } catch (SQLException erro) {
            System.out.println("Erro ao conectar: " + erro.getMessage());
            erro.printStackTrace();
        }
        return conexao;
    }
}