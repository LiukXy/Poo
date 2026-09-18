public class Paciente {
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private char genero;
    private String senha;
    private int idade;
    private String email;

    public Paciente() {}

    public Paciente(int _codigo, String _nome, String _email, int _idade, char _genero) {
        setCodigo(_codigo);
        setNome(_nome);
        setEmail(_email);
        setIdade(_idade);
        setGenero(_genero);
    }

    public Paciente(int codigo, String nome, String telefone, String email,
                    int idade, char genero, String senha) {
        setCodigo(codigo);
        setNome(nome);
        setTelefone(telefone);
        setEmail(email);
        setIdade(idade);
        setGenero(genero);
        setSenha(senha);
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) {
        this.codigo = (codigo < 0) ? 0 : codigo;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Nome não informado";
        } else {
            this.nome = nome.trim();
        }
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            this.cpf = "CPF não informado";
        } else if (!cpf.matches("\\d{11}")) {
            this.cpf = "CPF inválido";
        } else {
            this.cpf = cpf;
        }
    }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            this.telefone = "Telefone não informado";
        } else if (!telefone.matches("\\d{4,5}-\\d{4}")) {
            this.telefone = "Telefone inválido";
        } else {
            this.telefone = telefone;
        }
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            this.email = "email@naoinformado.com";
        } else if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            this.email = "email@invalido.com";
        } else {
            this.email = email.trim();
        }
    }

    public int getIdade() { return idade; }
    public void setIdade(int idade) {
        if (idade < 0) this.idade = 0;
        else if (idade > 120) this.idade = 120;
        else this.idade = idade;
    }

    public char getGenero() { return genero; }
    public void setGenero(char genero) {
        char g = Character.toUpperCase(genero);
        this.genero = (g != 'M' && g != 'F') ? 'N' : g;
    }

    public void cadastrar() {
        System.out.println("Paciente " + nome + " cadastrado no sistema.");
    }

    public void consultar() {
        System.out.println("Consultando dados do paciente " + nome);
    }

    public void mostrar() {
        System.out.println("Objeto do tipo Paciente");
        System.out.println("nome:" + this.nome);
        System.out.println("email:" + this.email);
        System.out.println("telefone:" + this.telefone);
        System.out.println("idade:" + this.idade);
    }

    public String getSenha() { return "************"; }
    public void setSenha(String senha) {
        if (senha == null || senha.trim().isEmpty()) {
            this.senha = "senha123";
        } else if (senha.length() < 6) {
            this.senha = senha + "000";
        } else {
            this.senha = senha;
        }
    }
}