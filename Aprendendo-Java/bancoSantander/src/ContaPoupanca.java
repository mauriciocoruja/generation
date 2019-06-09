public class ContaPoupanca extends Conta {
    private double taxaDeJuros;
    private double valorJuros;

    public ContaPoupanca() {

    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public ContaPoupanca(double saldo, Cliente cliente, double taxaDeJuros) {
        super(saldo, cliente);
        this.taxaDeJuros = taxaDeJuros;
    }

    public ContaPoupanca(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

    public double calculoTaxaJuros (){
        this.valorJuros = this.saldo * this.taxaDeJuros;
        return this.valorJuros+this.saldo;
    }

    public double sacarJuros (){
        return this.saldo - this.saldo * this.taxaDeJuros;
    }
}
