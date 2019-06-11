package exercicios.exercicio3.modelos;

public class CalculoMatematico {

    public int divisao(int a, int b) throws ArithmeticException{
//        try {
        if (a == 0 || b == 0){
            throw new ArithmeticException("Criei minha própria excessão");
        }
        return a / b;
//        } catch (ArithmeticException e){
//            System.out.println("Mermão, você está tentando dividir por zero. Sé loko!");
//            return 0;
//        }
    }
}
