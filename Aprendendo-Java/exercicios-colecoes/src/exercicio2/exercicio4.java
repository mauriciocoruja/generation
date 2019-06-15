package exercicio2;

import java.util.HashSet;
import java.util.Set;

public class exercicio4 {
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);
        System.out.println(conjunto);

        for (Integer itemDoConjunto : conjunto){
            System.out.println(itemDoConjunto);
        }
    }
}
