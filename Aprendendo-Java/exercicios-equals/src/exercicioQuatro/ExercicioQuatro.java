package exercicioQuatro;

import java.util.ArrayList;

public class ExercicioQuatro {
    public static void main(String[] args) {
        ArrayList<String> funcionarios = new ArrayList<String>();

        funcionarios.add(0,"Pedro");
        funcionarios.add(1,"Marcelo");
        funcionarios.add(2,"João");
        funcionarios.add(3,"Juca");
        funcionarios.add(3,"Marcos");

        System.out.println(funcionarios);

        System.out.println(funcionarios.contains("Marcos"));


    }
}
