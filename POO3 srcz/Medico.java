public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especialidade;
    private String senha;

    //constructor sem parametro
    public Medico (){

    }

    public Medico (String nome, String crm, String telefone, String especialidade, String senha){
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.senha = senha;
    }
    public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
    }   

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getespecialidade() {
        return especialidade;
    }
    public void setespecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getSenha() {
        return "********";
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void mostrar() {
        System.out.println("Medico [nome=" + nome + ", crm=" + crm + ", telefone=" + telefone + ", especialidade=" + especialidade
                + ", senha=" + senha + "]");
    }

    public void acessar(){
      
    }

}
