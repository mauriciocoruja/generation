public class Conta {
    private int numeroDaConta;
    private double saldo;
    private Cliente titular;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Conta(int numeroDaConta, double saldo, Cliente titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void deposito(double valorIn) {
        this.saldo = valorIn + this.saldo;
        System.out.println("Seu saldo após o depósito é de R$"+this.saldo);
    }

    public void saque(double valorOut) {

        if (this.saldo < valorOut){
            System.out.println("Ta sem grana, meu parceiro");
        }else {
            System.out.println("Boy! Você ainda tem " + this.saldo);
            this.saldo = this.saldo - valorOut;
            System.out.println("Seu saldo após o saque é de R$"+this.saldo);
        }
    }
}
