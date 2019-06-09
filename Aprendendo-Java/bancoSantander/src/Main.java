public class Main {

    public static void main(String[] args) {
        Cliente mauricio = new Cliente(1,"Mauricio", "Barbosa", "99.000.111-2","123.345.567-78");
        ContaCorrente contaCorrente = new ContaCorrente(500,mauricio,500);
        Cheque cheque = new Cheque(0,"BB","2019-06-06");

        System.out.println("Seu saldo inicial é R$" + contaCorrente.consultar());

        contaCorrente.depositar(500);

        System.out.println("Seu saldo atual após o deposito é R$" + contaCorrente.consultar());

        if (contaCorrente.saldo > contaCorrente.sacar(2500)){
            System.out.println("Seu saldo atual após o saque é R$" + contaCorrente.consultar());
        }else {
            System.out.println("Você não tem saldo o suficiente seu saldo atual é " + contaCorrente.consultar());
        }

        contaCorrente.depositarCheque(1500);
        System.out.println("Seu saldo atual após deposito do cheque é R$" + contaCorrente.consultar());


        if (contaCorrente.saldo > contaCorrente.sacar(2500)){
            System.out.println("Seu saldo atual após o saque é R$" + contaCorrente.consultar());
        }else {
            System.out.println("Valor de saque maior que o saldo: " + contaCorrente.consultar());
        }
    }

}
