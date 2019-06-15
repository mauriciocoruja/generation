package exercicio2;

import java.util.*;

public class exercicio2 {
    public static void main(String[] args) {

    /*Definir e inicializar uma nova lista vazia.
    Adicionar os seguintes elementos à lista vazia: 1,5,5,6,7,8,8,8.*/

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

    /*Imprimir o resultado na tela.*/

        for (Integer listItem : lista){
            System.out.println(listItem);
        }

    /*Definir e inicializar um novo conjunto vazio.
    Adicionar os seguintes elementos ao conjunto vazio: 1,5,5,6,7,8,8,8.*/

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

        /*Imprimir o resultado na tela. */

        for (Integer itemDoConjunto : conjunto){
            System.out.println(itemDoConjunto);
        }

        /*Qual é a diferença entre este exercício e o anterior?*/
        //A diferença é que, usando o Set ele não aceita dados repetidos
    }
}
