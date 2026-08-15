public class App {
    
    public static void main(String[] args) {
        System.out.println("sistema clinico\n"); 

     
        Paciente paciente = new Paciente();
         paciente.setnome("Maria Silva");
         paciente.setCpf("123.456.789-00");
         paciente.setTelefone("(11) 98765-4321");
         paciente.setGenero("feminino");
         paciente.setIdade(67);
         paciente.mostrar();
         paciente.cadastrar();
        System.out.println();

        Medico medico = new Medico();
            medico.setnome("dr mario");
            medico.setCrm("CRM 12345");
            medico.setTelefone("(92) 8002-8922");
            medico.setEspecialidade("cardiologo");
            medico.mostrar();
            medico.acessar();
        System.out.println();

        Recepcionista recepcionista = new Recepcionista();
            recepcionista.setnome("Renata Dutra");
            recepcionista.setCpf("987.654.321-00");
            recepcionista.setTelefone("(11) 1800-7777");
            recepcionista.mostrar();
            recepcionista.acessar();
        System.out.println();

        Agenda agenda = new Agenda();
            agenda.setData("15/08/2026");
            agenda.setHora("08:00");
            agenda.setMedico(medico);
            agenda.setPaciente(paciente);
            agenda.mostrar();
        System.out.println();

        Consulta consulta = new Consulta();
            consulta.setData("15/08/2026");
            consulta.setHora("14:30");
            consulta.setMedico(medico);
            consulta.setPaciente(paciente);
            consulta.setMotivo("dores no peito e arritmia ");
            consulta.setHistorico("historico familiar de problemas cardiacos");
            consulta.mostrar();
            consulta.marcar();
        System.out.println();

        Receita receita = new Receita();
            receita.setData("15/08/2026");
            receita.setDescritivo("tadalafeno");
            receita.setConsulta(consulta);
            receita.mostrar();
            receita.prescrever();
        System.out.println();

            Exame exame = new Exame();
            exame.setData("20/08/2026");
            exame.setDescritivo("eletrocardiograma");
            exame.setConsulta(consulta);
            exame.mostrar();
            exame.solicitar();
    }
}