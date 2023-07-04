package banco;
public class Banco {
    public static void main(String[] args) {
        //pessoa1
        contaBanco p1 = new contaBanco();
   
        p1.setNumeConta(4568);
        p1.setDono("Luiza");
        p1.abrirConta("CC");
        
        
        //pessoa2
        contaBanco p2 = new contaBanco();
        
        p2.setNumeConta(7922);
        p2.setDono("Carlos");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.sacar(150);
        p1.fecharConta();
    
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
