package banco;
public final class contaBanco {
    public int numeConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta: " + this.getNumeConta() );
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    
    }
    
    
    //Método Construtor
    public contaBanco(){
        this.setSaldo(0);
        setStatus(false);
    }
    
    
    //Métodos
    public void abrirConta(String t){
        this.setTipo(tipo);
        this.setStatus(true);
        
        if("CC".equals(t)){
            //this.saldo = 50;
            this.setSaldo(50);
        }else if("CP".equals(t)) {
            this.setSaldo(150);
            //this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!");
            
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("A conta não pode ser fechada, pois contém dinheiro!");
        }else if(this.getSaldo() < 0 ){
            System.out.println("A conta não pode ser fechada, pois está com débito!");
        }else{
            this.setStatus(false);
            System.out.println("A conta foi fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if(isStatus()){
            //this.saldo = this.saldo + v;
            setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    
    public void sacar(float v){
        if(this.isStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque!");
            }
        }else{
            System.out.println("Impossível fechar de uma conta fechada! ");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        
        if("CC".equals(getTipo())){
            v = 12;
        }else if ("CP".equals(getTipo())){
            v=20;
        }
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso pelo dono " + this.getDono());
        }else{
            System.out.println("Impóssivel pagar com uma conta fechada!");
        }
    }

    public int getNumeConta() {
        return numeConta;
    }

    public void setNumeConta(int numeConta) {
        this.numeConta = numeConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
