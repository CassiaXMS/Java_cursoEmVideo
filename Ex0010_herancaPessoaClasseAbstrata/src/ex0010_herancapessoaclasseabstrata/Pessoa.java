package ex0010_herancapessoaclasseabstrata;

public abstract class  Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    @Override
    public String toString() {
        return "DADOS:  {" + " nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + '}';
    }
    
    
    public void fazerAniversario(){
        this.idade++;
    }
    
    //Métodos modificadores e acessores (set get)

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

}
