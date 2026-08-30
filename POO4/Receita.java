public class Receita {
    private Consulta consulta;
    private String data;
    private String descritivo;

    public Receita(){}
    
    public Receita(Consulta consulta, String data, String descritivo) {
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }
    
    public Consulta getConsulta() {
        return consulta;
    }
    
    public void setConsulta(Consulta consulta) {
        if(consulta == null) {
            this.consulta = new Consulta();
        } else {
            this.consulta = consulta;
        }
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
    
    public String getDescritivo() {
        return descritivo;
    }
    
    public void setDescritivo(String descritivo) {
        if(descritivo == null || descritivo.trim().isEmpty()) {
            this.descritivo = "Receita não especificada";
        } else {
            this.descritivo = descritivo.trim();
        }
    }
    
    public void mostrar() {
        System.out.println( "Receita [consulta=" + consulta + ", data=" + data + ", descritivo=" + descritivo + "]");
    }

    public void preescrever(){}//todo
    public void consultar(){}//todo
}