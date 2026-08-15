public class Exame {
    private Consulta consulta;
    private String data;
    private String descritivo;

        public Consulta getConsulta() { return consulta; }
        public void setConsulta(Consulta consulta) { this.consulta = consulta; }
        
        public String getData() { return data; }
        public void setData(String data) { this.data = data; }
        
        public String getDescritivo() { return descritivo; }
        public void setDescritivo(String descritivo) { this.descritivo = descritivo; }

        public void solicitar() { System.out.println("solicitar exame"); }
        public void consultar() { System.out.println("consultando exame"); }

    public void mostrar() {
        System.out.println("exame");
        System.out.println("data " + this.data);
        System.out.println("descritivo: " + this.descritivo);
    }
}