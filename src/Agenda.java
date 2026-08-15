public class Agenda {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

        public String getData() { return data; }
        public void setData(String data) { this.data = data; }
        
        public String getHora() { return hora; }
        public void setHora(String hora) { this.hora = hora; }
        
        public Medico getMedico() { return medico; }
        public void setMedico(Medico medico) { this.medico = medico; }
        
        public Paciente getPaciente() { return paciente; }
        public void setPaciente(Paciente paciente) { this.paciente = paciente; }

        public void consultar() {
            System.out.println("consulta agenda ");
    }

    public void mostrar() {
        System.out.println("agenda");
        System.out.println("data" + this.data);
        System.out.println("horario " + this.hora);
        System.out.println("medico " + (medico != null ? medico.getnome() : "N/A"));
        System.out.println("paciente " + (paciente != null ? paciente.getnome() : "N/A"));
    }
}