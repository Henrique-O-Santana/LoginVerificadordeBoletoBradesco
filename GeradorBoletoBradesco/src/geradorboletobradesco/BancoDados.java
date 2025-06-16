package geradorboletobradesco;

import java.sql.*;

public class BancoDados {
    private static final String URL = "jdbc:h2:./boletosDB";
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
        String sql = "CREATE TABLE IF NOT EXISTS boletos (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "codigo VARCHAR(255) UNIQUE NOT NULL," +
                "tipo VARCHAR(50)," +
                "banco VARCHAR(100)," +
                "valor DOUBLE," +
                "beneficiario VARCHAR(255)," +
                "status VARCHAR(50)" +
                ");";

        try (Connection conn = conectar(); Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro criando tabela: " + e.getMessage());
        }
    }

    public static void inserirTeste() {
        String sql = "INSERT INTO boletos (codigo, tipo, banco, valor, beneficiario, status) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "23793381286000000012345678901234567890123456");
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