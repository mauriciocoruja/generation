public abstract class Conta {
    protected double saldo;
    protected Cliente cliente;

    public abstract void depositar(double valor);
    public abstract void consultar();
    public abstract void sacar();


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
