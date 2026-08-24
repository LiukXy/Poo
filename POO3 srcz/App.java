public class App {
    public static void main(String[] args) {
        System.out.println(" Sistema médico\n");

        Paciente paciente1 = new Paciente();
        paciente1.setCodigo(1);
        paciente1.setNome("Maria da Silva");
        paciente1.setTelefone("(11) 3244-2344");
        paciente1.setEmail("maria@norton.net.br");
        paciente1.setIdade(30);
        paciente1.setGenero("Feminino");  // ← String
        paciente1.setSenha("123123");
        paciente1.cadastrar();
        paciente1.mostrar();
        System.out.println("Senha da Maria: " + paciente1.getSenha());
        System.out.println();

        Paciente paciente2 = new Paciente();
        paciente2.setCodigo(2);
        paciente2.setNome("João Souza");
        paciente2.setTelefone("(11) 91234-5678");
        paciente2.setEmail("joao@email.com");
        paciente2.setIdade(45);
        paciente2.setGenero("Masculino");  // ← String
        paciente2.setSenha("456456");
        paciente2.cadastrar();
        paciente2.mostrar();
        System.out.println();

        Medico medico = new Medico();
        medico.setNome("Dr. João da Silva");
        medico.setCrm("CRM-SP 3245234234");
        medico.setTelefone("(11) 2344-2344");
        medico.setEspecialidade("Pediatra");
        medico.setSenha("med123");
        medico.acessar();
        medico.mostrar();
        System.out.println();


        Recepcionista recepcionista = new Recepcionista();
        recepcionista.setNome("Joana Oliveira");
        recepcionista.setCpf("432.534.543-5");
        recepcionista.setTelefone("(11) 3455-2344");
        recepcionista.setSenha("recep123");
        recepcionista.acessar();
        recepcionista.mostrar();
        System.out.println();

     
        Agenda agenda = new Agenda();
        agenda.setData("25/08/2026");
        agenda.setHora("10:00");
        agenda.setMedico(medico);
        agenda.setPaciente(paciente2);
        agenda.consultar();
        agenda.mostrar();
        System.out.println();

        Consulta consulta = new Consulta();
        consulta.setData("21/08/2026");
        consulta.setHora("15:00");
        consulta.setMedico(medico);
        consulta.setPaciente(paciente1);
        consulta.setMotivo("Dor de barriga");
        consulta.setHistorico("Paciente com histórico de má alimentação");
        consulta.marcar();
        consulta.mostrar();
        System.out.println();

   
        Receita receita = new Receita();
        receita.setData("21/08/2026");
        receita.setDescritivo("Buscopan + Luftal - Tomar conforme prescrição");
        receita.setConsulta(consulta);
        receita.prescrever();
        receita.mostrar();
        System.out.println();

      
        Exame exame = new Exame();
        exame.setData("28/08/2026");
        exame.setDescritivo("Exame de sangue - Jejum de 8 horas");
        exame.setConsulta(consulta);
        exame.solicitar();
        exame.mostrar();
    }
}