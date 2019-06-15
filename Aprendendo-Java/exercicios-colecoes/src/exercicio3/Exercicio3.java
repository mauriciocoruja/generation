package exercicio3;
import exercicio3.modelo.Prova;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        Set<Integer> somaDeNumeros = new HashSet<>();

        somaDeNumeros.add(3);
        somaDeNumeros.add(8);
        somaDeNumeros.add(6);
        somaDeNumeros.add(4);

        Prova prova = new Prova();

        prova.somaTotal(somaDeNumeros);
    }
}

