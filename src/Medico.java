public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

        public String getnome() { return nome; }
        public void setnome(String nome) { this.nome = nome; }
        
        public String getCrm() { return crm; }
        public void setCrm(String crm) { this.crm = crm; }
        
        public String getTelefone() { return telefone; }
        public void setTelefone(String telefone) { this.telefone = telefone; }
        
        public String getEspecialidade() { return especialidade; }
        public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
        
        public String getSenha() { return "********"; }
        public void setSenha(String senha) { this.senha = senha; }

        public void acessar() {
            System.out.println("medico acessado");
    }

    public void mostrar() {
        System.out.println("medico ");
        System.out.println("nome " + this.nome);
        System.out.println("crm" + this.crm);
        System.out.println("telefone: " + this.telefone);
        System.out.println("especialidade " + this.especialidade);
    }
}