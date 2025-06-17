package geradorboletobradesco;

import java.sql.*;

public class BancoDados {
    private static final String URL = "jdbc:h2:tcp://localhost/./boletosDB";
    private static final String USER = "sa";
    private static final String PASS = "";
    static Connection conectar;

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
            return null;
        }
    }

    public static void criarTabela() {
        String tabelaBanco = """
                CREATE TABLE IF NOT EXISTS boletos (
                id_boleto INT AUTO_INCREMENT PRIMARY KEY,
                codigo VARCHAR(255) UNIQUE NOT NULL,
                tipo VARCHAR(50),
                banco VARCHAR(100),
                valor DOUBLE,
                beneficiario VARCHAR(255),
                status VARCHAR(50));
                """;
        
        String user = """
                CREATE TABLE IF NOT EXISTS usuarios (
                id_user INT AUTO_INCREMENT PRIMARY KEY,
                nome VARCHAR(255) UNIQUE NOT NULL,
                email VARCHAR(50),
                senha VARCHAR(100));
                """;

        try (Connection conn = conectar(); Statement stmt = conn.createStatement()) {
            stmt.execute(tabelaBanco);
            stmt.execute(user);
        } catch (SQLException e) {
            System.out.println("Erro criando tabela: " + e.getMessage());
        }
    }

    public static void inserirTeste() {
        String sql = "INSERT INTO boletos (codigo, tipo, banco, valor, beneficiario, status) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "23593381286000000012345678901234567890123456");
            stmt.setString(2, "BOLETO");
            stmt.setString(3, "Bradesco");
            stmt.setDouble(4, 50.0);
            stmt.setString(5, "Empresa X");
            stmt.setString(6, "PENDENTE");
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro inserindo boleto: " + e.getMessage());
        }
    }
    
    
    
}