public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

        public String getnome() { return nome; }
        public void setnome(String nome)  { this.nome =  nome; }
        
        public String getCpf() { return cpf; }
        public void setCpf (String cpf) { this.cpf = cpf; }
        
        public String getTelefone() { return telefone; }
        public void setTelefone (String telefone) { this.telefone = telefone; }
        
        public String getSenha() { return "********"; }
        public void setSenha (String senha) { this.senha = senha; }

        public void acessar() {
            System.out.println("recepcionista acessou");
         }

    public void mostrar() {
        System.out.println("recepcionista");
        System.out.println("nome " + this.nome);
        System.out.println("cpf " + this.cpf);
        System.out.println("telefone " + this.telefone);
    }
}
