package com.fatec.poo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.fatec.poo.Recepcionista;

public class RecepcionistaDAO {
    private static final String URL = "jdbc:sqlite:exemplo.db";

    public RecepcionistaDAO() {
        criarNovaTabela();
    }

    public int inserir(Recepcionista obj) {
        String sql = "INSERT INTO recepcionista(nome, cpf, telefone, email, turno) VALUES(?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, obj.getNome());
            pstmt.setString(2, obj.getCpf());
            pstmt.setString(3, obj.getTelefone());
            pstmt.setString(4, obj.getEmail());
            pstmt.setString(5, obj.getTurno());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao inserir recepcionista: " + e.getMessage());
            return 0;
        }
    }

    public int alterar(Recepcionista obj) {
        String sql = "UPDATE recepcionista SET nome=?, cpf=?, telefone=?, email=?, turno=? WHERE codigo=?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, obj.getNome());
            pstmt.setString(2, obj.getCpf());
            pstmt.setString(3, obj.getTelefone());
            pstmt.setString(4, obj.getEmail());
            pstmt.setString(5, obj.getTurno());
            pstmt.setInt(6, obj.getCodigo());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao alterar recepcionista: " + e.getMessage());
            return 0;
        }
    }

    public int remover(Recepcionista obj) {
        String sql = "DELETE FROM recepcionista WHERE codigo=?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, obj.getCodigo());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.err.println("Erro ao remover recepcionista: " + e.getMessage());
            return 0;
        }
    }

    public void criarNovaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS recepcionista (\n"
                + " codigo integer PRIMARY KEY AUTOINCREMENT,\n"
                + " nome varchar(100) NOT NULL,\n"
                + " cpf varchar(20),\n"
                + " telefone varchar(30),\n"
                + " email varchar(100),\n"
                + " turno varchar(20)"
                + ");";
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela 'recepcionista' criada ou já existente.");
        } catch (Exception e) {
            System.err.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public Recepcionista carregar(int codigo) {
        var obj = new Recepcionista();
        String sql = "SELECT * FROM recepcionista WHERE codigo=" + codigo;
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\n--- Lista de Recepcionistas ---");
            if (rs.next()) {
                obj.setCodigo(codigo);
                obj.setNome(rs.getString("nome"));
                obj.setCpf(rs.getString("cpf"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setEmail(rs.getString("email"));
                obj.setTurno(rs.getString("turno"));
            }
        } catch (Exception e) {
            System.err.println("Erro ao carregar recepcionista: " + e.getMessage());
        }
        return obj;
    }
}