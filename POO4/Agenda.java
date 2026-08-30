public class Agenda {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;
    
    public Agenda() {}
    
    public Agenda(String data, String hora, Medico medico, Paciente paciente) {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
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
   
    public void mostrar() {
        System.out.println("Agenda [data=" + data + ", hora=" + hora + ", medico=" + medico + ", paciente=" + paciente + "]");
    }
    
    public void consultar(){
        //TODO
    }
}