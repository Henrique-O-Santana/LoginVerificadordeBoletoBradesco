package geradorboletobradesco;

import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class Boleto {
    protected String codigo;
    protected String banco;
    protected double valor;
    protected String beneficiario;
    protected StatusBoleto status;

    public Boleto(String codigo, String banco, double valor, String beneficiario, StatusBoleto status) {
        this.codigo = codigo;
        this.banco = banco;
        this.valor = valor;
        this.beneficiario = beneficiario;
        this.status = status;
    }
    
    
    public String getCodigo() {
        return codigo; }
    
    public String getBanco() {
        return banco; }
    
    public double getValor() { 
        return valor; }
    
    public String getBeneficiario() { 
        return beneficiario; }
    
    public StatusBoleto getStatus() {
        return status; }
}