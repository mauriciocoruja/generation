public abstract class Contas {
    private double deposito;
    private double saldo;
    private double saque;
//    private Clientes cliente;

    public abstract void depositar();
    public abstract void consultar();
    public abstract void sacar();

}
