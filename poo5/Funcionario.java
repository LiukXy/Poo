public class Funcionario {
    protected String nome;
    protected String telefone;
    protected String senha;

    public Funcionario() {}

    public Funcionario(String nome, String telefone, String senha) throws Exception {
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().isEmpty()) {
            throw new Exception("O nome do funcionário é obrigatório!!!");
        }
        this.nome = nome.trim();
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            this.telefone = "Telefone não informado";
        } else if (!telefone.matches("\\d{4,5}-\\d{4}")) {
            this.telefone = "Telefone inválido";
        } else {
            this.telefone = telefone;
        }
    }

    public String getSenha() {
        return "************";
    }

    public void setSenha(String senha) {
        if (senha == null || senha.trim().isEmpty()) {
            this.senha = "senha123";
        } else if (senha.length() < 6) {
            this.senha = senha + "000";
        } else {
            this.senha = senha;
        }
    }

    public void acessar() {
        System.out.println("Acessando o sistema como " + getClass().getSimpleName());
    }

    public void mostrar() {
        System.out.println(getClass().getSimpleName()
                + " [nome=" + nome + ", telefone=" + telefone + ", senha=" + senha + "]");
    }
}