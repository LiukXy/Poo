public class Recepcionista extends Funcionario {
    private String cpf;

    public Recepcionista() {
        super();
    }

    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        super(nome, telefone, senha);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            this.cpf = "CPF não informado";
        } else if (!cpf.matches("\\d{11}")) {
            this.cpf = "CPF inválido";
        } else {
            this.cpf = cpf;
        }
    }

    // ASSOCIAÇÃO: Recepcionista cadastra Paciente
    public void cadastrar(Paciente paciente) {
        if (paciente == null) {
            System.out.println("Paciente inválido para cadastro.");
            return;
        }
        System.out.println("Recepcionista " + nome + " cadastrou o paciente: " + paciente.getNome());
        paciente.cadastrar();
    }

    // ASSOCIAÇÃO: Recepcionista marca Consulta
    public void marcar(Consulta consulta) {
        if (consulta == null) {
            System.out.println("Consulta inválida.");
            return;
        }
        System.out.println("Recepcionista " + nome + " marcou a consulta para "
                + consulta.getData() + " às " + consulta.getHora());
        consulta.marcar();
    }

    @Override
    public void acessar() {
        System.out.println("Recepcionista " + nome + " acessou o sistema");
    }

    @Override
    public void mostrar() {
        System.out.println("Recepcionista [nome=" + nome + ", cpf=" + cpf
                + ", telefone=" + telefone + ", senha=" + senha + "]");
    }
}