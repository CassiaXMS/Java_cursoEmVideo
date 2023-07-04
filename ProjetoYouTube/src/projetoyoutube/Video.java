package projetoyoutube;
public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int curtidas;
    private int views;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.curtidas = 0;
        this.views = 0;
        this.reproduzindo = false;
    }

    @Override
    public String toString() {
        return " Video { " + " titulo = " + titulo + ", \navaliacao = " + avaliacao +
                ", curtidas = " + curtidas + ", views = " + views +
                ", \nreproduzindo = " + reproduzindo + '}';
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    
    
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }
    
}
