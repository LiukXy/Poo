public class Exame extends Procedimento {
    private Consulta consulta;

    public Exame() {
        super();
    }

    public Exame(Consulta consulta, String data, String descritivo) {
        super(data, descritivo);
        setConsulta(consulta);
    }

    public Consulta getConsulta() { return consulta; }
    public void setConsulta(Consulta consulta) {
        this.consulta = (consulta == null) ? new Consulta() : consulta;
    }

    public void solicitar() {
        System.out.println("Solicitando exame: " + descritivo);
    }

    @Override
    public void consultar() {
        System.out.println("Consultando exame de " + data + ": " + descritivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Exame [data=" + data + ", descritivo=" + descritivo + "]");
    }
}