package geradorboletobradesco;

import java.sql.Connection;
import java.util.Optional;

public class VerificadorBoleto extends BancoDados{
    public static String verificar(String codigo) {
        try (Connection conn = BancoDados.conectar) {
            BoletoDAO dao = new BoletoDAO(conn);
            Optional <Boleto> boletoOpt = dao.buscarPorCodigo(codigo);

            if (boletoOpt.isPresent()) {
                Boleto b = boletoOpt.get();
                return String.format(
                        "-----------------------------\n" +
                        "| Banco: %s\n" +
                        "| Beneficiário: %s\n" +
                        "| Valor: R$ %.2f\n" +
                        "| Status: %s\n" +
                        "-----------------------------",
                        b.getBanco(), b.getBeneficiario(), b.getValor(), b.getStatus());
            } else {
                return "⚠️ Boleto não encontrado ou suspeito!";
            }
        } catch (Exception e) {
            return "❌ Erro na verificação!";
        }
    }
}