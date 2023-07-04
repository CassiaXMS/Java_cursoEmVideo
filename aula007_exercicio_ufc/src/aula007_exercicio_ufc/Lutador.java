package aula007_exercicio_ufc;
public final class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empate;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empate = empate;
    }
    
    public void apresentar(){
        System.out.println("---------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente da " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura()+ "m");
        System.out.println("pesando "+ this.getPeso() +"Kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void status() {
        System.out.println("--------------------------------------------");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Empatou " + this.getEmpates()+ " vezes");
        System.out.println("Perdeu " + this.getDerrotas()+ " vezes");
        
    }
    
    public void ganharLutar(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() +1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() +1);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }
    
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    } 
    
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        
        if(this.getPeso() < 52.2 ){
                this.categoria = "Inválido";
            }else if(this.getPeso() <= 70.3){
                this.categoria = "Leve";
            }else if(this.getPeso() <= 83.9 ){
                this.categoria = "Médio";
            }else if(this.getPeso() <= 120.2){
                this.categoria = "Pesado";
            }else{
                this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empate;
    }
    public void setEmpates(int empate) {
        this.empate = empate;
    }     
}
