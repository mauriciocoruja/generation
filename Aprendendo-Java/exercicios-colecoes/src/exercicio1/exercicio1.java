package exercicio1;

import java.util.HashMap;
import java.util.Map;

public class exercicio1 {

    public static void main(String[] args) {

        Map<Integer, String> dicionario = new HashMap<>();

        dicionario.put(0,"Ovos");
        dicionario.put(1,"Água");
        dicionario.put(2,"Escopeta");
        dicionario.put(3,"Cavalo");
        dicionario.put(4,"Dentista");
        dicionario.put(5,"Fogo");

        System.out.println(dicionario);

        for (Integer palavra : dicionario.keySet()){
            System.out.println(dicionario.get(palavra));
        }

        //System.out.println(dicionario.get(1));


    }
}
