public class ContaPoupanca extends Conta {
    private double taxaDeJuros;

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public ContaPoupanca(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void recolherTaxaDeJuros() {

    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }
}
