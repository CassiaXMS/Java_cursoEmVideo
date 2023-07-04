package ex0010_herancapessoaclasseabstrata;
public class Ex0010_herancaPessoaClasseAbstrata {

    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        v1.setNome("Eduardo");
        v1.setSexo("M");
        v1.setIdade(45);
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Evandro");
        a1.setIdade(15);
        a1.setMatricula(1235);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Cassia");
        b1.setCurso("Java");
        b1.setMatricula(5678);
        b1.pagarMensalidade();
        b1.renovarBolsa();
        System.out.println(b1.toString());
    }
}
