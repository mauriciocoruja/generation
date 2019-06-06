public class ContaCorrente extends Conta {

    private double chequeEspecial;
    private double limite;


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

    @Override
    public double sacar(double valor) {
        this.limite = this.saldo + this.chequeEspecial;
        if(valor <= limite){
            this.limite -= valor;
        }
        return this.saldo;
    }

    public ContaCorrente() {
    }

    public double depositarCheque(double valor) {
        this.saldo += valor;
        return this.saldo;

    }
}
