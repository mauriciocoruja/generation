package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {

        try{
            List<String> animais = new ArrayList<>();

            animais.add("Pato");
            animais.add("Cachorro");
            animais.add("Gato");

            System.out.println(animais.get(3));
        } catch (IndexOutOfBoundsException e){
//            e.printStackTrace(); //Usado para exibir a mensagem de erro
            System.out.println("Caiu na excessão");
        }


    }
}
