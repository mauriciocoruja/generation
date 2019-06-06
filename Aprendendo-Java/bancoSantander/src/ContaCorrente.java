public class ContaCorrente extends Contas {

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

    @Override
    public void depositar() {

    }

    @Override
    public void consultar() {

    }

    @Override
    public void sacar() {

    }
}
