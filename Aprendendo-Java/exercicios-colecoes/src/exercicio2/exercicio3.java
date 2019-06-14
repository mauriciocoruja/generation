package exercicio2;

import java.util.*;

public class exercicio3 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);

        System.out.println(lista);

        for (Integer listItem : lista){
            System.out.println(listItem);
        }

        Set<Integer> conjunto = new HashSet<>();
            conjunto.add(1);
            conjunto.add(5);
            conjunto.add(5);
            conjunto.add(6);
            conjunto.add(7);
            conjunto.add(8);
            conjunto.add(8);
            conjunto.add(8);
        System.out.println("\n-------------------\n");
        System.out.println(conjunto);

        for (Integer itemDoConjunto : conjunto){
            System.out.println(itemDoConjunto);
        }
    }
}
