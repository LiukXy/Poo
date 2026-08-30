public class Consulta {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    public Consulta(){}

    public Consulta(String data, String hora, Medico medico, Paciente paciente, String motivo, String historico) {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        if(data == null || data.trim().isEmpty()) {
            this.data = "01/01/2024";
        } else if(!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.data = "01/01/2024";
        } else {
            this.data = data;
        }
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        if(hora == null || hora.trim().isEmpty()) {
            this.hora = "08:00";
        } else if(!hora.matches("\\d{2}:\\d{2}")) {
            this.hora = "08:00";
        } else {
            this.hora = hora;
        }
    }
    
    public Medico getMedico() {
        return medico;
    }
    
    public void setMedico(Medico medico) {
        if(medico == null) {
            this.medico = new Medico();
        } else {
            this.medico = medico;
        }
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        if(paciente == null) {
            this.paciente = new Paciente();
        } else {
            this.paciente = paciente;
        }
    }
    
    public String getMotivo() {
        return motivo;
    }
    
    public void setMotivo(String motivo) {
        if(motivo == null || motivo.trim().isEmpty()) {
            this.motivo = "Motivo não informado";
        } else {
            this.motivo = motivo.trim();
        }
    }
    
    public String getHistorico() {
        return historico;
    }
    
    public void setHistorico(String historico) {
        if(historico == null || historico.trim().isEmpty()) {
            this.historico = "Sem histórico";
        } else {
            this.historico = historico.trim();
        }
    }
    
    public void mostrar() {
        System.out.println("Consulta [data=" + data + ", hora=" + hora );
        System.out.println("\n medico=" + medico.getNome() + ", paciente=" + paciente);
        System.out.println("\n\n motivo=" + motivo + ", historico=" + historico );
    }

    public void cancelar(){}//todo
    public void marcar(){}//todo
    public void consultar(){}//todo
    public void realizar(){}//todo
    public void atualizar(){}//todo
}