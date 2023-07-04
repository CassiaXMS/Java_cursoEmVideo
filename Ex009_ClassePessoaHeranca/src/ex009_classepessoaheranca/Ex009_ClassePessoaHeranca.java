package ex009_classepessoaheranca;
public class Ex009_ClassePessoaHeranca {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Funcionario f1= new Funcionario();
        Professor pr1 = new Professor();
        
        p1.setNome("Lucas");
        a1.setNome("Eduardo");
        f1.setNome("Francisco");
        pr1.setNome("Joana");
        
        p1.setSexo("M");
        pr1.setSexo("F");
        a1.setIdade(45);
        a1.setCurso("Informática");
        pr1.setSalario(2458.66f);
        f1.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(a1.toString());
        System.out.println(f1.toString());
        System.out.println(pr1.toString());
        
    
    }
    
}
