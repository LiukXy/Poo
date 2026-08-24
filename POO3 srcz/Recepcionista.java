public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;


    public Recepcionista (){
        
    }

    public Recepcionista (String nome, String cpf, String telefone, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    

    public void acessar(){
        //TODO
    }
   
    public void mostrar() {
        System.out.println("Recepcionista [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", senha=" + senha + "]");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSenha() {
        return "************";
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
