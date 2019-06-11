package exercicios;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.printf("Digite um numero: ");

        int a;

        a = numero.nextInt();

        System.out.println("Antecessor: "+(a-1)+"\nNumero: "+a+"\nSucessor: "+(a+1));

    }
}
