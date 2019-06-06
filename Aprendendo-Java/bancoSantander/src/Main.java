public class Main {

    public static void main(String[] args) {
        Cliente mauricio = new Cliente(1,"Mauricio", "Barbosa", "99.000.111-2","123.345.567-78");
        ContaCorrente contaCorrente = new ContaCorrente(500,mauricio,500);

        contaCorrente.depositar(500);
    }

}
