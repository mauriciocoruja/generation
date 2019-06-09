package exercicioUm;

import exercicioUm.modelos.Pessoa;

import java.util.Objects;

public class exercicioUm {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Alfredo", 123456789);
        Pessoa p2 = new Pessoa("Florencio", 123456789);

        System.out.println(p1.equals(p2)); //O resultado é false


    }
}
