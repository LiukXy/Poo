public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;
    private String senha;

        public String getnome() { return nome; }
        public void setnome(String nome) { this.nome = nome; }
        
        public String getCpf() { return cpf; }
        public void setCpf(String cpf) { this.cpf = cpf; }
        
        public String getTelefone() { return telefone; }
        public void setTelefone(String telefone) { this.telefone = telefone; }
        
        public String getGenero() { return genero; }
        public void setGenero(String genero) { this.genero = genero; }
        
        public int getIdade() { return idade; }
        public void setIdade(int idade) { this.idade = idade; }
        
        public String getSenha() { return "********"; }
        public void setSenha(String senha) { this.senha = senha; }


    public void cadastrar() {
        System.out.println("cadastro paciente");
    }

    public void consultar() {
        System.out.println("Consulta paciente...");
    }

    public void mostrar() {
        System.out.println("paciente");
        System.out.println("nome " + this.nome);
        System.out.println("cpf " + this.cpf);
        System.out.println("telefone " + this.telefone);
        System.out.println("genero " + this.genero);
        System.out.println("idade " + this.idade);
    }
}

