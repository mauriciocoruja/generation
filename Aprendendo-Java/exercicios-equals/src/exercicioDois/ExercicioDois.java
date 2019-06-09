package exercicioDois;

import exercicioDois.modelos.Coca;

public class ExercicioDois {
    public static void main(String[] args) {
        Coca c1 = new Coca(2, 2.3);
        Coca c2 = new Coca(2, 5.5);

       // System.out.println(c1.equals(c2)); primeiro resultado = false

        System.out.println(c1.equals(c2)); // resultado true
    }
}
