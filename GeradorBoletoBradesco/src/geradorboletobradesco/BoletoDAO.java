package geradorboletobradesco;

import java.sql.*;
import java.util.Optional;

public class BoletoDAO {
    private final Connection conn;

    public BoletoDAO(Connection conn) {
        this.conn = conn;
    }
    
    

    public Optional<Boleto> buscarPorCodigo(String codigo) {
        String sql = "SELECT * FROM boletos WHERE codigo = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, codigo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return Optional.of(new BoletoBancario(
                    rs.getString("codigo"),
                    rs.getString("tipo"),
                    rs.getString("banco"),
                    rs.getDouble("valor"),
                    rs.getString("beneficiario"),
                    StatusBoleto.valueOf(rs.getString("status"))
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return Optional.empty();
    }
    
    
}
