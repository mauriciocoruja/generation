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
    }
}
