package aula06;
public class ControleRemoto implements Controlador{
   //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;
   
    //MÉTODOS ESPECIAIS: Construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligado= false;
        this.tocando = false;
    }
    
    //MÉTODOS GETTER AND SETTERS
    private int getVolume(){
        return volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }
    
    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    
    private boolean getTocando(){
        return tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    //MÉTODOS ABSTRATOS DA INTERFACE
    //@ - ESTÁ SOBRESCREVENDO
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("--- MENU -----");
        System.out.println("Está ligado: " + this.getLigado());
        System.out.println("Está tocando: " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        
        for(int i=0; i<=this.getVolume(); i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+ 5);
        }else{
            System.out.println("Ops, NÃO tem como aumentar, o controlador está deligado! ");
        }
    }
    
    @Override
    public void menoVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
             System.out.println("Ops, o controlador está deligado! ");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não consegui reproduzir, pois está desligado!");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Não consegui pausar, pois está desligado!");
        }
    }
}
