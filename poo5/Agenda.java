public class Agenda extends Consulta {

    public Agenda() {
        super();
    }

    public Agenda(String data, String hora, Medico medico, Paciente paciente) {
        super(data, hora, medico, paciente, "Agendamento", "Sem histórico");
    }

    @Override
    public void consultar() {
        System.out.println("Consultando agenda do dia " + getData()
                + " às " + getHora());
        if (getMedico() != null) {
            System.out.println("  Médico: " + getMedico().getNome());
        }
        if (getPaciente() != null) {
            System.out.println("  Paciente: " + getPaciente().getNome());
        }
    }

    @Override
    public void mostrar() {
        System.out.println("Agenda [data=" + getData() + ", hora=" + getHora()
                + ", medico=" + (getMedico() != null ? getMedico().getNome() : "N/A")
                + ", paciente=" + (getPaciente() != null ? getPaciente().getNome() : "N/A") + "]");
    }
}