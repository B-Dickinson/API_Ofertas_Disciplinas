package ap3;


public class Coordenador {
       private String nome;
       private String sexo;
       private String cpf;
       private String email;
       private String naturalidade;
       private String estadoNatal;
       private String telefone;
       
public Coordenador(){
    
}   

public Coordenador(String nome, String sexo, String cpf, String email, String naturalidade,
String estadoNatal, String telefone){
       
       this.nome = nome;
       this.cpf = cpf;
       this.sexo = sexo;
       this.email = email;
       this.naturalidade = naturalidade;
       this.estadoNatal = estadoNatal;
       this.telefone = telefone;
    
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEstadoNatal() {
        return estadoNatal;
    }

    public void setEstadoNatal(String estadoNatal) {
        this.estadoNatal = estadoNatal;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
       

@Override
public String toString(){

    return "Nome: "+this.getNome() +"\n" + "\nCpf: "+this.getCpf() +"\n" + "\nSexo: "
            + this.getSexo() + "\n" + "\nCidade: "+ this.getNaturalidade()+ "\n" + "\nEstado: "
            + this.getEstadoNatal() + "\n" + "\nTelefone: " + this.getTelefone() + "\n" + "\nEmail: "
            + this.getEmail();
}

}
