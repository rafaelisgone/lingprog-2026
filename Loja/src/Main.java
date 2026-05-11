import java.sql.*;
import java.util.Scanner;

public class Main{

    // cria tabelas
    public static void criarTabela(Connection conn) throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS produtos (" +
                "id SERIAL PRIMARY KEY, " +
                "nome TEXT NOT NULL, " +
                "preco REAL NOT NULL, " +
                "estoque INTEGER DEFAULT 0)";
        // cria objeto de instrução SQL
        Statement stmt = conn.createStatement();
        stmt.execute(sql); // executa comando SQL
        stmt.close(); // fecha instrução SQL
    }

    // deleta um registro
    public static void removerProduto(Connection conn, Scanner sc) throws SQLException{
        System.out.println("Informe o ID do produto:");
        int id = sc.nextInt();
        String sql = "DELETE FROM  produtos WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        int linhasAfetadas = ps.executeUpdate();
        ps.close();
        if (linhasAfetadas > 0){
            System.out.println("Produto removido!");
        }
        else System.out.println("ID não encontrado.");

    }

    // consulta
    public static void consulta(Connection conn) throws SQLException{
        // criar comando sql
        String sql = "SELECT * FROM produtos ORDER BY nome";
        Statement stat = conn.createStatement();
        // executa a consulta no banco e armazena o resultado em rs
        ResultSet rs = stat.executeQuery(sql);
        while(rs.next()){
            // recupera o valor de cada coluna
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            double preco = rs.getDouble("preco");
            int estoque = rs.getInt("estoque");
            // mostra o registro da consulta
            System.out.printf("[%d] %s - R$ %.2f (estoque: %d)%n", id, nome, preco, estoque);
        }
    }

    // atualizar
    public static void atualizarPreco(Connection con, Scanner sc) throws SQLException {
        System.out.println("Informe o novo preço do produto:");
        double novoPreco = sc.nextDouble();
        System.out.println("Informe o ID do produto:");
        int id = sc.nextInt();
        String sql = "UPDATE produtos SET preco = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, novoPreco);
        ps.setInt(2, id);
        int linhasAfetadas = ps.executeUpdate();
        if (linhasAfetadas > 0){
            System.out.println("Preço atualizado com sucesso.");
        }
        else {
            System.out.println("Produto não encontrado.");
        }
    }

    // insere
    public static void insere(Connection conn, Scanner sc)
            throws SQLException {
        System.out.println("Informe o nome do produto:");
        String nome = sc.nextLine();
        System.out.println("Informe o preço do produto:");
        double preco = sc.nextDouble();
        System.out.println("Informe o estoque do produto:");
        int estoque = sc.nextInt();
        // cria SQL
        String sql = "INSERT INTO produtos (nome, preco, estoque) values (?, ?, ?)";
        // prepara uma instrução SQL
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nome); // define o nome do produto
        ps.setDouble(2, preco); // define o preço do produto
        ps.setInt(3, estoque); // define estoque do produto
        ps.executeUpdate(); // executa o SQL
        System.out.println("Produto inserido com sucesso");
        ps.close();
    }

    // menu
    public static void exibirMenu (){
        System.out.println("========== CRUD DE PRODUTOS ==========");
        System.out.print("1. Listar produtos.\n" +
                "2. Inserir produto.\n" +
                "3. Atualizar preço.\n" +
                "4. Remover produto\n" +
                "0. Sair\n" +
                "Opção: ");
    }

    // processar op
    public static void processarOpcao (Connection conn, Scanner sc, int opcao) throws SQLException {
        switch (opcao){
            case 1: consulta(conn); break;
            case 2: insere(conn, sc); break;
            case 3: atualizarPreco(conn, sc); break;
            case 4: removerProduto(conn, sc); break;
            case 0:
                System.out.println("Encerrando..."); break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    public static void main(String[] args){
        String url = "jdbc:postgresql://localhost:5432/loja";
        try { // tenta se conectar no banco de dados
            Connection conn = DriverManager.getConnection(
                    url, "postgres", "fatec123*");
            System.out.println("Conexão com sucesso");
            // conexão com o banco
            criarTabela(conn);
            Scanner sc = new Scanner(System.in);
            int opcao = 1;
            do {
                exibirMenu();
                opcao = sc.nextInt();
                sc.nextLine();
                processarOpcao(conn, sc, opcao);
            } while (opcao != 0);
        }
        catch (SQLException e){ // caso dê erro, desvia pra cá
            System.out.println("Erro ao conectar com o banco " + e.getMessage());
        }
    }
}