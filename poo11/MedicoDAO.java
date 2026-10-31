package com.fatec.poo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.fatec.poo.Medico;

public class MedicoDAO {
    private static final String URL = "jdbc:sqlite:exemplo.db";

    public MedicoDAO() {
        criarNovaTabela();
    }

    public int inserir(Medico obj) {
        String sql = "INSERT INTO medico(nome, crm, especialidade, telefone, email) VALUES(?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, obj.getNome());
            pstmt.setString(2, obj.getCrm());
            pstmt.setString(3, obj.getEspecialidade());
            pstmt.setString(4, obj.getTelefone());
            pstmt.setString(5, obj.getEmail());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao inserir medico: " + e.getMessage());
            return 0;
        }
    }

    public int alterar(Medico obj) {
        String sql = "UPDATE medico SET nome=?, crm=?, especialidade=?, telefone=?, email=? WHERE codigo=?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, obj.getNome());
            pstmt.setString(2, obj.getCrm());
            pstmt.setString(3, obj.getEspecialidade());
            pstmt.setString(4, obj.getTelefone());
            pstmt.setString(5, obj.getEmail());
            pstmt.setInt(6, obj.getCodigo());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao alterar medico: " + e.getMessage());
            return 0;
        }
    }

    public int remover(Medico obj) {
        String sql = "DELETE FROM medico WHERE codigo=?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, obj.getCodigo());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao remover medico: " + e.getMessage());
            return 0;
        }
    }

    public void criarNovaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS medico (\n"
                + " codigo integer PRIMARY KEY AUTOINCREMENT,\n"
                + " nome varchar(100) NOT NULL,\n"
                + " crm varchar(30),\n"
                + " especialidade varchar(100),\n"
                + " telefone varchar(30),\n"
                + " email varchar(100)"
                + ");";
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'medico' criada ou já existente.");
        } catch (Exception e) {
            System.err.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public Medico carregar(int codigo) {
        var obj = new Medico();
        String sql = "SELECT * FROM medico WHERE codigo=" + codigo;
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\n--- Lista de Médicos ---");
            if (rs.next()) {
                obj.setCodigo(codigo);
                obj.setNome(rs.getString("nome"));
                obj.setCrm(rs.getString("crm"));
                obj.setEspecialidade(rs.getString("especialidade"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setEmail(rs.getString("email"));
            }
        } catch (Exception e) {
            System.err.println("Erro ao carregar medico: " + e.getMessage());
        }
        return obj;
    }
}