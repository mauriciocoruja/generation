import java.util.*;

public class Main {

    public static void main(String[] args) {
//        HashSet
        /*Set<String> nomes = new HashSet<>();

        nomes.add("João");
        nomes.add("Jorge");
        nomes.add("Maria");
        nomes.add("Pedro");

        nomes.remove("João");

        for (String nome : nomes){
            System.out.println(nome);
        }*/

//        Map

        /*
        Map<String, Integer> mapaNomeIdade = new HashMap<>();

        mapaNomeIdade.put("Pablo",28);
        mapaNomeIdade.put("Mauricio",25);
        mapaNomeIdade.put("Gabriel",22);

        System.out.println(mapaNomeIdade);

        for (String chave : mapaNomeIdade.keySet()){
            System.out.println(mapaNomeIdade.get(chave));
        }

        System.out.println(mapaNomeIdade.get("Pablo"));
        */

//        List

        List<String> frutas = new ArrayList<>();

        frutas.add("Morango");
        frutas.add("Banana");
        frutas.add("Abacate");
        frutas.add("Amora");

        System.out.println("--Exemplos 1--\n");

        for(int i = 0; i < frutas.size(); i++){
            System.out.println(frutas.get(i));
        }

        System.out.println("--Exemplos 2--\n");

        for(String fruta : frutas){
            System.out.println(fruta);
        }

        //System.out.println(frutas);

    }
}
