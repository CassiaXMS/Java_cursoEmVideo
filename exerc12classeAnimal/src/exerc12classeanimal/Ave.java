package exerc12classeanimal;
public class Ave extends Animal {
    
    private String corPena;

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da ave");
    }
    
    public void fazerNinho(){
        System.out.println("Construiu ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
