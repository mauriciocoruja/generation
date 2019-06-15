package exercicio3.modelo;

import java.util.Set;

public class Prova {
/*Criar uma nova classe chamada Prova. Definir e implementar o seguinte método:
public void somaTotal(Set<Integer> conjuntoDeInteiros)

O método deve percorrer o conjunto de inteiros, ir acumulando o total da soma
dos valores e, no final, imprimir na tela o valor da soma total.*/

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;
        for (Integer item : conjuntoDeInteiros){
            soma = soma + item;
        }
        System.out.println("Soma: "+soma);
    }
}
