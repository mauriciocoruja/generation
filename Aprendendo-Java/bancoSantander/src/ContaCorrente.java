public class ContaCorrente extends Conta {

    private double chequeEspecial;


    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente(double saldo,Cliente cliente, double chequeEspecial) {
        super(saldo, cliente);
        this.chequeEspecial = chequeEspecial;
    }

    public ContaCorrente() {
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
        System.out.println("Seu saldo após o depósito é R$"+this.saldo);
    }

    @Override
    public void consultar() {

    }

    @Override
    public void sacar() {

    }
    public void depositarCheque() {

    }
}
