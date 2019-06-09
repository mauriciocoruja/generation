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

    @Override
    public double sacar(double valor) {
        System.out.println("Valor do saque: R$"+valor);
        this.saldo += this.chequeEspecial;
        if(valor <= saldo || valor <= (this.saldo + this.chequeEspecial)){
            this.saldo -= valor;
        } else {
            return this.saldo;
        }
        return this.saldo;
    }

    public ContaCorrente() {
    }

    public double depositarCheque(double valor) {
        System.out.println("Valor do Cheque: R$"+valor);
        this.saldo += valor;
        return this.saldo;

    }
}
