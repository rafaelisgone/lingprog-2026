import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Main{
    public static void criarTabela(Connection conn) throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS livros (" +
                "id SERIAL PRIMARY KEY, " +
                "titulo TEXT NOT NULL, " +
                "autor TEXT NOT NULL, " +
                "ano INTEGER NOT NULL, " +
                "disponivel INTEGER NOT NULL)";
        // cria objeto de instrução SQL
        Statement stmt = conn.createStatement();
        stmt.execute(sql); // executa comando SQL
        stmt.close(); // fecha instrução SQL
    }



    //======================================================================================

    public static void main (String[] args){
        String url = "jdbc:postgresql://localhost:5432/biblioteca";
        try { // tenta se conectar no banco de dados
            Connection conn = DriverManager.getConnection(
                    url, "postgres", "fatec123*");
            System.out.print("Conexão com sucesso");
            // conexão com o banco
            criarTabela(conn);
        }
        catch (SQLException e){ // caso dê erro, desvia pra cá
            System.out.print("Erro ao conectar com o banco " + e.getMessage());
        }
    }
}