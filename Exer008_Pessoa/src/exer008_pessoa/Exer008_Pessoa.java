package exer008_pessoa;
public class Exer008_Pessoa {

    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Jorge", 56, 'M');
        p[1]= new Pessoa("Helena", 14, 'F');
        
        l[0] = new Livro("Aprendendo Java", "Guilherme Ferraz", 300, p[0]);
        l[1]= new Livro("Aventuras de Caribe", "João Martins", 450, p[1]);
        l[2] = new Livro("PHP iniciante", "Heitor Hugo", 154, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPagina();
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
    }
    
}
