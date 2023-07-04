package projetoyoutube;
public class Visualizacao {
    private Gafanhoto espectador;
    private Video Filme;

    public Visualizacao(Gafanhoto espectador, Video Filme) {
        this.espectador = espectador;
        this.Filme = Filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() +1);
        this.Filme.setViews(this.Filme.getViews() + 1);
    }

    @Override
    public String toString() {
        return " Visualizacao { " + " Espectador = " + espectador + ",\nFilme = " + Filme + '}';
    }
    
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return Filme;
    }

    public void setFilme(Video Filme) {
        this.Filme = Filme;
    }
   
    
    public void avaliar(){
        this.Filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.Filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if(porc <= 20){
            tot= 3;
        }else if(porc <= 50){
            tot =5;
        }else if(porc <= 90){
            tot=8;
        }else{
            tot = 10;
        }
        this.Filme.setAvaliacao(tot);
    }
}
