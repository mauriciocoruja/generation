package modelo;

public class Cachorro extends Animal{

    @Override
    public void respirar() {
        System.out.println("Cães respiram pelas narinas");
    }

    @Override
    public void comer() {
        System.out.println("Cães comem pela boca");
    }
}
