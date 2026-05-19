import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class Main{
    // menu
    public static void exibirMenu (){
        System.out.println("========== Biblioteca  ==========");
        System.out.print("1. Listar livros.\n" +
                "2. Cadastrar livro.\n" +
                "3. Emprestar livro.\n" +
                "4. Devolver livro.\n" +
                "5. Remover livro.\n" +
                "0. Sair.\n" +
                "Opção: ");
    }

    // processar opcao
    public static void processarOpcao (Connection conn, Scanner sc, int opcao) throws SQLException {
        switch (opcao){
            case 1: listarLivros(conn); break;
            case 2: cadastrarLivros(conn, sc); break;
            case 3: emprestarLivros(conn, sc); break;
            case 4: devolverLivros(conn, sc); break;
            case 5: removerLivros(conn, sc); break;
            case 0:
                System.out.println("Encerrando..."); break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    //==================================================================

    // funções do CRUD
    // cria tabela
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

    // cadastrar livros
    public static void cadastrarLivros(Connection conn, Scanner sc)
            throws SQLException {
        System.out.println("Digite o título do livro:");
        String titulo = sc.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = sc.nextLine();
        System.out.println("Digite o ano do lançamento do livro:");
        int ano = sc.nextInt();
        int dispo = 1;

        String sql = "INSERT INTO livros (titulo, autor, ano, disponivel) VALUES (?, ?, ?, ?)"; // cria SQL
        PreparedStatement ps = conn.prepareStatement(sql); // prepara uma instrução SQL
        ps.setString(1, titulo); // define o titulo do livro
        ps.setString(2, autor); // define o autor do livro
        ps.setInt(3, ano); // define o ano do livro
        ps.setInt(4, dispo); // define a disponibilidade
        ps.executeUpdate(); // executa o SQL
        System.out.println("Livro cadastrado com êxito!");
        ps.close();
    }

    //==================================================================

    // lista de livros
    /*public static void listarLivros (Connection conn) throws SQLException{
        String sql = "SELECT * FROM livros ORDER BY titulo"; // criar comando sql
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql); // executa a consulta no banco e armazena o resultado
        while(rs.next()){
            // recupera o valor de cada coluna
            int id = rs.getInt("id");
            String titulo = rs.getString("titulo");
            String autor = rs.getString("autor");
            int ano = rs.getInt("ano");
            int dispo = rs.getInt("disponivel");
            // mostra o registro da consulta

            System.out.printf("");
        }
    }*/

    //==================================================================

    // lista de livros
    public static void listarLivros(Connection conn) throws SQLException {

        String sql = "SELECT * FROM livros ORDER BY titulo"; // cria comando sql
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(sql); // executa a consulta no banco e armazena o resultado

        while (rs.next()) {
            // recupera os valores
            int id = rs.getInt("id");
            String titulo = rs.getString("titulo");
            String autor = rs.getString("autor");
            int ano = rs.getInt("ano");
            int dispo = rs.getInt("disponivel");

            // converte status
            String status = (dispo == 1) ? "DISPONIVEL" : "EMPRESTADO";

            // imprime formatado
            System.out.printf(
                    "[%d] %s - %s (%d) - %s%n",
                    id, titulo, autor, ano, status
            );
        }
    }

    // emprestar
    public static void emprestarLivros(Connection conn, Scanner sc) throws SQLException {
        // ler id
        System.out.print("Digite o ID do livro: ");
        int id = sc.nextInt();

        // verifica se o livro existe
        String verifica = "SELECT * FROM livros WHERE id = ?";
        PreparedStatement psVerifica = conn.prepareStatement(verifica);
        psVerifica.setInt(1, id);

        ResultSet rs = psVerifica.executeQuery();

        if (rs.next()) {
            String sql = "UPDATE livros SET disponivel = 0 WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Livro emprestado com sucesso!");
            ps.close();

        } else {
            System.out.println("Livro não encontrado.");
        }
        rs.close();
        psVerifica.close();
    }

    // devolver livro
    public static void devolverLivros(Connection conn, Scanner sc) throws SQLException {
        // ler id do livro
        System.out.print("Digite o ID do livro: ");
        int id = sc.nextInt();

        // verifica se o livro existe
        String verifica = "SELECT * FROM livros WHERE id = ?";
        PreparedStatement psVerifica = conn.prepareStatement(verifica);
        psVerifica.setInt(1, id);
        ResultSet rs = psVerifica.executeQuery();

        if (rs.next()) {
            String sql = "UPDATE livros SET disponivel = 1 WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Livro devolvido com sucesso!");
            ps.close();
        } else {
            System.out.println("Livro não encontrado.");
        }
        rs.close();
        psVerifica.close();
    }

    // remover livro
    public static void removerLivros(Connection conn, Scanner sc) throws SQLException {
        // ler id
        System.out.print("Digite o ID do livro: ");
        int id = sc.nextInt();

        // verifica se existe
        String verifica = "SELECT * FROM livros WHERE id = ?";
        PreparedStatement psVerifica = conn.prepareStatement(verifica);
        psVerifica.setInt(1, id);
        ResultSet rs = psVerifica.executeQuery();

        if (rs.next()) {
            String sql = "DELETE FROM livros WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Livro removido com sucesso!");
            ps.close();
        } else {
            System.out.println("Livro não encontrado.");
        }
        rs.close();
        psVerifica.close();
    }

    public static void main (String[] args){
        String url = "jdbc:postgresql://localhost:5432/biblioteca";
        try { // tenta se conectar no banco de dados
            Connection conn = DriverManager.getConnection(
                    url, "postgres", "fatec123*");
            System.out.print("Conexão com sucesso.\n");
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
            System.out.print("Erro ao conectar com o banco " + e.getMessage());
        }
    }
}