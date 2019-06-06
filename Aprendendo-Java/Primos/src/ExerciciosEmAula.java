import java.util.Scanner;

public class ExerciciosEmAula {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in); //Objeto para pegar os dados do usuario
        int numUser; //Declaração do tipo de variavel
        System.out.print("Digite um número:"); //Imprimir na tela o que o usuario deve digitar
        numUser = scanner.nextInt(); //armazenamento do input dado pelo usuario
        boolean ehPrimo = true; // Parte do ponto que primo é igual a verdadeiro

        for (int i = 2; i < numUser; i++){
        //Nessa linha, as condições já estão desconsiderando o numero 1 e o numero digitado pelo usuario.
        //Dessa forma, se o numero for divisivel por qualquer outro nosses parametros ele já informa que o numero não é primo.
        //Pois primo só é divisivel por 1 ou por ele mesmo.
            if (numUser % i == 0){ //Aqui ele compara se o resto da divisão é igual a zero, se for, ele imprime os valores que foram usados na divisão
                System.out.println("O numero é divisível por "+i);
                ehPrimo = false; //Aqui ele já mostra a saida dessa condição, que é zero.
            }
        }
        if (ehPrimo){ //aqui ele já parte do ponto que a declaração é verdadeira
            System.out.println("O numero "+numUser+" é primo");
        }else{
            System.out.println("O número "+numUser+" não é primo");
        }
        */

        int[] numUser;
        numUser = new int[9];
        boolean ehPrimo = true;

        for (int i = 2; i < numUser.length; i++){
            if (numUser[i] % i == 0){
                System.out.println("O numero é divisível por "+i);
                ehPrimo = false;
            }
        }
        if (ehPrimo){
            System.out.println("O numero "+[i]+" é primo");
        }else{
            System.out.println("O número "+numUser+" não é primo");
        }
    }
}

