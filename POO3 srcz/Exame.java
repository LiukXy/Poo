public class Exame {
  private Consulta consulta;
    private String data;
    private String descritivo;

    public Exame (){
        
    }
     
    public Exame(Consulta consulta, String data, String descritivo) {
    this.consulta = consulta;
    this.data = data;
    this.descritivo = descritivo;
    }
    public void solicitar() {
    System.out.println("Exame solicitado");
}

    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }
    
    public void mostrar() {
        System.out.println( "Receita [consulta=" + consulta + ", data=" + data + ", descritivo=" + descritivo + "]");
    }

    public void preescrever(){}//todo
    public void consultar(){}//todo
}
