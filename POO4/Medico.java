public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especilidade;
    private String senha;

    public Medico(){}
    
    public Medico(String nome, String crm, String telefone, String especilidade, String senha) throws Exception {
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecilidade(especilidade);
        setSenha(senha);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) throws Exception {
        if(nome == null || nome.trim().isEmpty()) {
            throw new Exception("O nome do médico é obrigatório!!!");
        }
        this.nome = nome.trim();
    }
    
    public String getCrm() {
        return crm;
    }
    
    public void setCrm(String crm) throws Exception {
        if(crm == null || crm.trim().isEmpty()) {
            throw new Exception("Crm Obrigatório!!");
        }
        if(!crm.matches("\\d{4,6}")) {
            throw new Exception("CRM deve conter apenas números (4-6 dígitos)");
        }
        this.crm = crm;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        if(telefone == null || telefone.trim().isEmpty()) {
            this.telefone = "Telefone não informado";
        } else if(!telefone.matches("\\d{4,5}-\\d{4}")) {
            this.telefone = "Telefone inválido";
        } else {
            this.telefone = telefone;
        }
    }
    
    public String getEspecilidade() {
        return especilidade;
    }
    
    public void setEspecilidade(String especilidade) {
        if(especilidade == null || especilidade.trim().isEmpty()) {
            this.especilidade = "Especialidade não informada";
        } else {
            this.especilidade = especilidade.trim();
        }
    }
    
    public String getSenha() {
        return "********";
    }
    
    public void setSenha(String senha) {
        if(senha == null || senha.trim().isEmpty()) {
            this.senha = "senha123";
        } else if(senha.length() < 6) {
            this.senha = senha + "000";
        } else {
            this.senha = senha;
        }
    }

    public void mostrar() {
        System.out.println("Medico [nome=" + nome + ", crm=" + crm + ", telefone=" + telefone + ", especilidade=" + especilidade
                + ", senha=" + senha + "]");
    }

    public void acessar(){
        //TODO
    }
}