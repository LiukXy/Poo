public class Consulta {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

        public String getData() { return data; }
        public void setData(String data) { this.data = data; }
        
        public String getHora() { return hora; }
        public void setHora(String hora) { this.hora = hora; }
        
        public Medico getMedico() { return medico; }
        public void setMedico(Medico medico) { this.medico = medico; }
        
        public Paciente getPaciente() { return paciente; }
        public void setPaciente(Paciente paciente) { this.paciente = paciente; }
        
        public String getMotivo() { return motivo; }
        public void setMotivo(String motivo) { this.motivo = motivo; }
        
        public String getHistorico() { return historico; }
        public void setHistorico(String historico) { this.historico = historico; }

        public void marcar() { System.out.println("consulta agendada"); }
        public void cancelar() { System.out.println("consulta cancelada"); }
        public void consultar() { System.out.println("consultando a consulta."); }
        public void realizar() { System.out.println("consulta concluida"); }
        public void atualizar() { System.out.println("consulta attualizada"); }

    public void mostrar() {
        System.out.println("consulta");
        System.out.println("data " + this.data);
        System.out.println("horario " + this.hora);
        System.out.println("medico " + (medico != null ? medico.getnome() : "N/A"));
        System.out.println("paciente " + (paciente != null ? paciente.getnome() : "N/A"));
        System.out.println("razão " + this.motivo);
        System.out.println("historico " + this.historico);
    }
}