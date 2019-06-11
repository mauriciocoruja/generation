package exercicios.exercicio3;

import exercicios.exercicio3.modelos.CalculoMatematico;

public class Teste extends CalculoMatematico {
    public static void main(String[] args) {


        CalculoMatematico conta = new CalculoMatematico();
        try {
            System.out.println(conta.divisao(4,0));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
