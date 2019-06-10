package exercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exercicio2 {
    public static void main(String[] args) {
        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> joao = new ArrayList<>();
        joao.add("Juan");
        joao.add("Fissure");
        joao.add("Maromba");
        apelidos.put("João", joao);

        List<String> miguel = new ArrayList<>();
        miguel.add("Night Watch");
        miguel.add("Bruce Wayne");
        miguel.add("Tampinha");
        apelidos.put("Miguel", miguel);

        List<String> maria = new ArrayList<>();
        maria.add("Wonder");
        maria.add("Mary");
        maria.add("Marilene");
        apelidos.put("Maria", maria);

        List<String> lucas = new ArrayList<>();
        lucas.add("Lukinha");
        lucas.add("Jorge");
        lucas.add("George");
        apelidos.put("Lucas", lucas);

        System.out.println(apelidos+"\n");

        for(String apelido : apelidos.keySet()){
            System.out.println("Nome: " + apelido + " " +apelidos.get(apelido));
        }

    }

}
