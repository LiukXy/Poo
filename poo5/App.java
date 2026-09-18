public class App {
    public static void main(String[] args) {
        try {
            // ===== HERANÇA: Medico e Recepcionista são Funcionarios =====
            var medico = new Medico("Dr. Carlos", "234234", "2344-2344", "otorrino", "123123");
            var recep  = new Recepcionista("Joana", "4325345435", "3455-2344", "senha123");

            System.out.println("=== FUNCIONÁRIOS (Herança) ===");
            medico.mostrar();
            recep.mostrar();
            medico.acessar();
            recep.acessar();

            // ===== PACIENTES =====
            var maria = new Paciente();
            maria.setCodigo(1);
            maria.setNome("Maria");
            maria.setEmail("maria@norton.net.br");
            maria.setIdade(30);
            maria.setTelefone("3244-2344");
            maria.setCpf("12345678901");
            maria.setSenha("123123");

            var jose = new Paciente(2, "Jose", "j@j.com", 12, 'M');

            // ===== ASSOCIAÇÃO: Recepcionista -> Paciente =====
            System.out.println("\n=== ASSOCIAÇÃO Recepcionista -> Paciente ===");
            recep.cadastrar(maria);
            recep.cadastrar(jose);

            // ===== CONSULTA: AGREGAÇÃO com Medico e Paciente =====
            System.out.println("\n=== AGREGAÇÃO Consulta -> Medico / Paciente ===");
            var consulta = new Consulta();
            consulta.setData("21/08/2026");
            consulta.setHora("15:00");
            consulta.setMedico(medico);
            consulta.setPaciente(maria);
            consulta.setMotivo("dor de barriga");
            consulta.setHistorico("pare de comer besteira");
            consulta.mostrar();

            System.out.println("\n=== ASSOCIAÇÃO Recepcionista -> Consulta ===");
            recep.marcar(consulta);

            // ===== COMPOSIÇÃO: Consulta cria Receita e Exame =====
            System.out.println("\n=== COMPOSIÇÃO Consulta -> Receita / Exame ===");
            consulta.emitirReceita("21/08/2026", "buscopan + luftal");
            consulta.solicitarExame("22/08/2026", "hemograma completo");

            if (consulta.getReceita() != null) {
                System.out.println("\n--- Receita (Herança de Procedimento) ---");
                consulta.getReceita().mostrar();
                consulta.getReceita().preescrever();
                consulta.getReceita().consultar();
            }

            if (consulta.getExame() != null) {
                System.out.println("\n--- Exame (Herança de Procedimento) ---");
                consulta.getExame().mostrar();
                consulta.getExame().solicitar();
                consulta.getExame().consultar();
            }

            System.out.println("\n=== HERANÇA Agenda -> Consulta ===");
            var agenda = new Agenda("25/08/2026", "10:00", medico, jose);
            agenda.mostrar();
            agenda.consultar();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}