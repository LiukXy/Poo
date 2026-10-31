package com.fatec.poo;

import com.fatec.poo.dao.MedicoDAO;
import com.fatec.poo.dao.PacienteDAO;
import com.fatec.poo.dao.RecepcionistaDAO;

public class Main {
    public static void main(String[] args) {

        var medicoDAO = new MedicoDAO();
        var m = new Medico();
        m.setNome("Dr. Carlos");
        m.setCrm("CRM-SP 12345");
        m.setEspecialidade("Cardiologia");
        m.setTelefone("3456-7890");
        m.setEmail("carlos@clinica.com");
        System.out.println("Medico inserido: " + medicoDAO.inserir(m));

        m.setCodigo(1);
        m.setEmail("carlos.novo@clinica.com");
        medicoDAO.alterar(m);

        var m2 = medicoDAO.carregar(1);
        System.out.println("medico: " + m2.getNome() + " - " + m2.getEmail());

        var recDAO = new RecepcionistaDAO();
        var r = new Recepcionista();
        r.setNome("Ana");
        r.setCpf("111.222.333-44");
        r.setTelefone("9876-5432");
        r.setEmail("ana@clinica.com");
        r.setTurno("Manhã");
        System.out.println("Recepcionista inserido: " + recDAO.inserir(r));

        r.setCodigo(1);
        r.setTurno("Tarde");
        recDAO.alterar(r);

        var r2 = recDAO.carregar(1);
        System.out.println("recepcionista: " + r2.getNome() + " - " + r2.getTurno());

        var pacDAO = new PacienteDAO();
        var p = new Paciente();
        p.setNome("João");
        p.setCpf("555.666.777-88");
        p.setDataNascimento("1990-05-10");
        p.setTelefone("91234-5678");
        p.setEmail("joao@email.com");
        p.setLogradouro("Rua A, 100");
        p.setConvenio("Unimed");
        System.out.println("Paciente inserido: " + pacDAO.inserir(p));

        p.setCodigo(1);
        p.setTelefone("99999-0000");
        pacDAO.alterar(p);

        var p2 = pacDAO.carregar(1);
        System.out.println("paciente: " + p2.getNome() + " - " + p2.getTelefone()
                + " - " + p2.getConvenio());
    }
}