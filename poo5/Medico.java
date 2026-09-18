public class Medico extends Funcionario {
    private String crm;
    private String especilidade;

    public Medico() {
        super();
    }

    public Medico(String nome, String crm, String telefone, String especilidade, String senha) throws Exception {
        super(nome, telefone, senha);
        setCrm(crm);
        setEspecilidade(especilidade);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception {
        if (crm == null || crm.trim().isEmpty()) {
            throw new Exception("Crm Obrigatório!!");
        }
        if (!crm.matches("\\d{4,6}")) {
            throw new Exception("CRM deve conter apenas números (4-6 dígitos)");
        }
        this.crm = crm;
    }

    public String getEspecilidade() {
        return especilidade;
    }

    public void setEspecilidade(String especilidade) {
        if (especilidade == null || especilidade.trim().isEmpty()) {
            this.especilidade = "Especialidade não informada";
        } else {
            this.especilidade = especilidade.trim();
        }
    }

    @Override
    public void acessar() {
        System.out.println("Dr(a). " + nome + " acessou o sistema como Médico");
    }

    @Override
    public void mostrar() {
        System.out.println("Medico [nome=" + nome + ", crm=" + crm
                + ", telefone=" + telefone + ", especilidade=" + especilidade
                + ", senha=" + senha + "]");
    }
}