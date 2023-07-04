package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {
        
        Video V[] = new Video[3];
        V[0] = new Video("Aula 01 de POO");
        V[1] = new Video("Aula 12 de PHP");
        V[2]= new Video("Aula 13 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Cassia", 15, "F", "Cssaia");
        g[1] = new Gafanhoto("fernando", 22, "M", "FER124");
        
        System.out.println("-------------- Videos  ---------------- \n");
        System.out.println(V[0].toString());
        System.out.println(V[1].toString());
        System.out.println(V[2].toString());
        
        System.out.println("-------------- Gafanhotos  ----------------\n");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        
        Visualizacao vis[] = new Visualizacao[5];
        
        vis[0] = new Visualizacao(g[0], V[1]); //Cassia assiste PHP
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        
        vis[1] = new Visualizacao(g[0], V[2]); //Cassia assite HTML5
        vis[1].avaliar(88.0f);
        System.out.println(vis[0].toString());
        
    }
    
}
