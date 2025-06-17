/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geradorboletobradesco;

import static geradorboletobradesco.BancoDados.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Usuario extends BancoDados{
    private String nome;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public static void inserirUsuario(String nome, String email, String senha) {
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";

        try (Connection conn = conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, senha);

            stmt.executeUpdate();
            System.out.println("Usuário inserido com sucesso.");
        } 
        catch (SQLException e) {
            System.out.println("Erro inserindo usuário: " + e.getMessage());
        }
    }
    
    public static boolean Login(String cpf, String senha) {
        String sql = "SELECT * FROM usuarios WHERE email = ?";

        try (Connection conn = conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cpf);

            ResultSet busca = stmt.executeQuery();

            if (busca.next()) {
                String senhaBanco = busca.getString("senha");
                if (senhaBanco.equals(senha)) {
                    System.out.println("Login realizado com sucesso. Bem-vindo, " + busca.getString("nome") + "!");
                    return true;
                } else{
                    System.out.println("Senha incorreta.");
                    return false;
                }
            } else {
                System.out.println("CPF não encontrado.");
                return false;
            }
        }catch (SQLException e) {
            System.out.println("Erro no login: " + e.getMessage());
            return false;
        }
    }
}
