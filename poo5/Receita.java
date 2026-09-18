public class Receita extends Procedimento {
    private Consulta consulta;

    public Receita() {
        super();
    }

    public Receita(Consulta consulta, String data, String descritivo) {
        super(data, descritivo);
        setConsulta(consulta);
    }

    public Consulta getConsulta() { return consulta; }
    public void setConsulta(Consulta consulta) {
        this.consulta = (consulta == null) ? new Consulta() : consulta;
    }

    public void preescrever() {
        System.out.println("Prescrevendo receita: " + descritivo);
    }

    @Override
    public void consultar() {
        System.out.println("Consultando receita de " + data + ": " + descritivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Receita [data=" + data + ", descritivo=" + descritivo + "]");
    }
}