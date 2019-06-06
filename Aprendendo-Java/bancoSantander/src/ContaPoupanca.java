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
    public void depositar(double valor) {

    }

    @Override
    public void consultar() {

    }

    @Override
    public void sacar() {

    }
}
