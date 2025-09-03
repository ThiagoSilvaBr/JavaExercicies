public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    ContaBancaria(String titular, double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getnumeroConta(){
        return this.numeroConta;
    }

    public void setDepositar(double valor){
        if(valor>0){
            this.saldo += valor;
        }else{
            System.out.println("O valor deve ser positivo");
        }
    }

    public void setSacar(double valor){
        if(this.saldo>valor){
            this.saldo -= valor;
        }else {
            System.out.println("Não há saldo suficiente");
        }
    }
}
