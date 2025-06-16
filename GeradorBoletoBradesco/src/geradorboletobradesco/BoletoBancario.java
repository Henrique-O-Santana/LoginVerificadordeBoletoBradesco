package geradorboletobradesco;

public class BoletoBancario extends Boleto {
    private String tipo;

    public BoletoBancario(String codigo, String tipo, String banco, double valor, String beneficiario, StatusBoleto status) {
        super(codigo, banco, valor, beneficiario, status);
        this.tipo = tipo;
    }

    public String getTipo() {return tipo;}
}
