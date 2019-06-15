package exercicio3;

import java.util.Set;

public class Prova {
/*Criar uma nova classe chamada Prova. Definir e implementar o seguinte método:
public void somaTotal(Set<Integer> conjuntoDeInteiros)*/

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;
        for (Integer item : conjuntoDeInteiros){
            soma = soma + item;
        }
        System.out.println("Soma: "+soma);
    }

}
