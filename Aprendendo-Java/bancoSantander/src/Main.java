public class Main {

    public static void main(String[] args) {
        Cliente mauricio = new Cliente(1,"Mauricio", "Barbosa", "99.000.111-2","123.345.567-78");
        ContaCorrente contaCorrente = new ContaCorrente(500,mauricio,500);
        Cheque cheque = new Cheque(0,"BB","2019-06-06");

        System.out.println("Seu saldo inicial é R$"+contaCorrente.consultar());
        contaCorrente.depositar(0);
        System.out.println("Seu saldo atual após o deposito é R$"+contaCorrente.consultar());
        contaCorrente.sacar(1500);
        System.out.println("Seu saldo atual após o saque é R$"+contaCorrente.consultar());
//        contaCorrente.depositarCheque(0);
//        System.out.println("Seu saldo atual após deposito do cheque é R$"+contaCorrente.consultar());
    }

}
