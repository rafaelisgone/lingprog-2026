import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Main{
    public static void criarTabela(Connection conn) throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                "id SERIAL PRIMARY KEY, " +
                "nome TEXT NOT NULL, " +
                "preco REAL NOT NULL, " +
                "estoque INTEGER DEFAULT 0)";

        //cria objeto de instrução SQL
        Statement stmt = conn.createStatement();
        stmt.execute(sql); // executa comando sql
        stmt.close(); // fecha instrução sql
    }
    public static void insere(Connection conn, String nome, double preco, int estoque) throws SQLException {
        // cria sql
        String sql = "INSERT INFO produtos (nome, preco, estoque) value (?, ?, ?)";
        // prepara uma instrução SQL
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nome); // define o nome do produto
        ps.setDouble(2, preco); // define o preco do produto
        ps.setInt(3, estoque); // define estoque do produto
        ps.executeUpdate(); //executa o SQL
        System.out.print("Produto inserido com sucesso");
        ps.close();
    }
        public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5432/loja";
        try{ //tenta se conectar no BD
            Connection conn = DriverManager.getConnection(url, "postgres", "fatec123*");
            System.out.print("Conexão com sucesso.");
            criarTabela(conn);
            insere(conn, "mouse", 149, 3);
        }
        catch (SQLException e){
            System.out.print("Erro ao se conectar com o banco.\n"+ e.getMessage());
        }
    }
}