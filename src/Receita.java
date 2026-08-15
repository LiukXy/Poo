public class Receita {
    private Consulta consulta;
    private String data;
    private String descritivo;

        public Consulta getConsulta() { return consulta; }
        public void setConsulta(Consulta consulta) { this.consulta = consulta; }
        
        public String getData() { return data; }
        public void setData(String data) { this.data = data; }
        
        public String getDescritivo() { return descritivo; }
        public void setDescritivo(String descritivo) { this.descritivo = descritivo; }

        public void prescrever() { System.out.println("prescrevendo receita"); }
        public void consultar() { System.out.println("consultando a receita"); }

    public void mostrar() {
        System.out.println("receita");
        System.out.println("data " + this.data);
        System.out.println("descritivo " + this.descritivo);
    }
}