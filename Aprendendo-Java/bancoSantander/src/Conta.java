public abstract class Conta {
    protected double saldo;
    protected Cliente cliente;

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }
    public double consultar(){
        return this.saldo;
    }
    public abstract double sacar(double valor);


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta(double saldo,Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Conta() {
    }
}
