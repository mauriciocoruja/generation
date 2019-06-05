import modelo.Cachorro;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(true);

        System.out.println(cachorro.animalEhMamifero());
        System.out.println(cachorro.isTemPelo());
        System.out.println(cachorro.getIdade());

    }
}
