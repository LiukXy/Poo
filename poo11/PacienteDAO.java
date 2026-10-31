package com.fatec.poo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.fatec.poo.Paciente;

public class PacienteDAO {
    private static final String URL = "jdbc:sqlite:exemplo.db";

    public PacienteDAO() {
        criarNovaTabela();
    }

    public int inserir(Paciente obj) {
        String sql = "INSERT INTO paciente(nome, cpf, data_nascimento, telefone, email, logradouro, convenio) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, obj.getNome());
            pstmt.setString(2, obj.getCpf());
            pstmt.setString(3, obj.getDataNascimento());
            pstmt.setString(4, obj.getTelefone());
            pstmt.setString(5, obj.getEmail());
            pstmt.setString(6, obj.getLogradouro());
            pstmt.setString(7, obj.getConvenio());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao inserir paciente: " + e.getMessage());
            return 0;
        }
    }

    public int alterar(Paciente obj) {
        String sql = "UPDATE paciente SET nome=?, cpf=?, data_nascimento=?, telefone=?, email=?, logradouro=?, convenio=? WHERE codigo=?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, obj.getNome());
            pstmt.setString(2, obj.getCpf());
            pstmt.setString(3, obj.getDataNascimento());
            pstmt.setString(4, obj.getTelefone());
            pstmt.setString(5, obj.getEmail());
            pstmt.setString(6, obj.getLogradouro());
            pstmt.setString(7, obj.getConvenio());
            pstmt.setInt(8, obj.getCodigo());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao alterar paciente: " + e.getMessage());
            return 0;
        }
    }

    public int remover(Paciente obj) {
        String sql = "DELETE FROM paciente WHERE codigo=?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, obj.getCodigo());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao remover paciente: " + e.getMessage());
            return 0;
        }
    }

    public void criarNovaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS paciente (\n"
                + " codigo integer PRIMARY KEY AUTOINCREMENT,\n"
                + " nome varchar(100) NOT NULL,\n"
                + " cpf varchar(20),\n"
                + " data_nascimento varchar(20),\n"
                + " telefone varchar(30),\n"
                + " email varchar(100),\n"
                + " logradouro varchar(1000),\n"
                + " convenio varchar(100)"
                + ");";
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'paciente' criada ou já existente.");
        } catch (Exception e) {
            System.err.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public Paciente carregar(int codigo) {
        var obj = new Paciente();
        String sql = "SELECT * FROM paciente WHERE codigo=" + codigo;
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\n--- Lista de Pacientes ---");
            if (rs.next()) {
                obj.setCodigo(codigo);
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setDataNascimento(rs.getString("data_nascimento"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setEmail(rs.getString("email"));
                obj.setLogradouro(rs.getString("logradouro"));
                obj.setConvenio(rs.getString("convenio"));
            }
        } catch (Exception e) {
            System.err.println("Erro ao carregar paciente: " + e.getMessage());
        }
        return obj;
    }
}