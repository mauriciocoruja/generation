import modelo.Animal;

public class Main {

    public static void main(String[] args) {

        Animal ricota = new Animal("Ricota",3,"Luan");

        /*
        ricota.setNome("Ricota");
        ricota.setIdade(3);
        ricota.setDono("Luan");
        */

        System.out.println("Nome: " + ricota.getNome());
        System.out.println("Idade: " + ricota.getIdade()+" anos");

        //-------------------

        Animal fritz = new Animal("Fritz",10,"Jorge");

        /*
        fritz.setNome("Fritz");
        fritz.setIdade(10);
        ricota.setDono("Jorge");
        */

        System.out.println("Nome: " + fritz.getNome());
        System.out.println("Idade: " + fritz.getIdade()+" anos");
    }
}
