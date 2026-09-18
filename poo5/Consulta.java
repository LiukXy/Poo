public class Consulta {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    private String motivo;
    private String historico;

    // COMPOSIÇÃO
    private Receita receita;
    private Exame exame;

    public Consulta() {}

    public Consulta(String data, String hora, Medico medico, Paciente paciente,
                    String motivo, String historico) {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }

    public String getData() { return data; }
    public void setData(String data) {
        if (data == null || data.trim().isEmpty() || !data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.data = "01/01/2024";
        } else {
            this.data = data;
        }
    }

    public String getHora() { return hora; }
    public void setHora(String hora) {
        if (hora == null || hora.trim().isEmpty() || !hora.matches("\\d{2}:\\d{2}")) {
            this.hora = "08:00";
        } else {
            this.hora = hora;
        }
    }

    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) {
        this.medico = (medico == null) ? new Medico() : medico;
    }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) {
        this.paciente = (paciente == null) ? new Paciente() : paciente;
    }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) {
        this.motivo = (motivo == null || motivo.trim().isEmpty())
                ? "Motivo não informado" : motivo.trim();
    }

    public String getHistorico() { return historico; }
    public void setHistorico(String historico) {
        this.historico = (historico == null || historico.trim().isEmpty())
                ? "Sem histórico" : historico.trim();
    }

    // COMPOSIÇÃO
    public void emitirReceita(String data, String descritivo) {
        this.receita = new Receita(this, data, descritivo);
        System.out.println("Receita emitida para a consulta de " + paciente.getNome());
    }

    public void solicitarExame(String data, String descritivo) {
        this.exame = new Exame(this, data, descritivo);
        System.out.println("Exame solicitado para a consulta de " + paciente.getNome());
    }

    public Receita getReceita() { return receita; }
    public Exame getExame() { return exame; }

    public void mostrar() {
        System.out.println("Consulta [data=" + data + ", hora=" + hora);
        System.out.println(" medico=" + (medico != null ? medico.getNome() : "N/A")
                + ", paciente=" + (paciente != null ? paciente.getNome() : "N/A"));
        System.out.println(" motivo=" + motivo + ", historico=" + historico + "]");
    }

    public void cancelar() { System.out.println("Consulta cancelada."); }
    public void marcar()   { System.out.println("Consulta marcada."); }
    public void consultar(){ System.out.println("Consultando agenda..."); }
    public void realizar() { System.out.println("Consulta realizada."); }
    public void atualizar(){ System.out.println("Consulta atualizada."); }
}