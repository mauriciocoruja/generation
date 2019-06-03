public class Exercicio1 {
    public static void main(String[] args) {
        Cliente Mauricio = new Cliente("Mauricio", "Barbosa");
        Conta contaMauricio = new Conta(0001,1000, Mauricio);

        System.out.println("Cliente: "+Mauricio.getNome()+" "+Mauricio.getSobrenome());
        System.out.println("O saldo atual é R$"+contaMauricio.getSaldo());
        contaMauricio.deposito(500);
        contaMauricio.saque(1000);

        System.out.println("\n");

        Cliente Pedro = new Cliente("Pedro", "Alcantra");
        Conta contaPedro = new Conta(0002,2000, Pedro);


        System.out.println("Cliente: "+Pedro.getNome()+" "+Pedro.getSobrenome());
        System.out.println("O saldo atual é R$"+contaPedro.getSaldo());
        contaPedro.deposito(500);
        contaPedro.saque(500);


    }
}
