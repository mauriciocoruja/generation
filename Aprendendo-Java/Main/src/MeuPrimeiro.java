import java.util.Scanner;

public class MeuPrimeiro {
    public static void main(String[] args) {

        /*float n1, n2, media;
        Scanner dado = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");//entra info
        n1 = dado.nextFloat();                       //salva info
        System.out.print("Digite a segunda nota: ");
        n2 = dado.nextFloat();
        media = (n1+n2)/2; //processa info
        System.out.println("A média é: "+media);     //sai info*/

        int n1, n2, n3, n4, soma;
        Scanner contaDeMais = new Scanner(System.in);
        System.out.print("Digite o numero 1: ");
        n1 = contaDeMais.nextInt();
        System.out.print("Digite o numero 2: ");
        n2 = contaDeMais.nextInt();
        System.out.print("Digite o numero 3: ");
        n3 = contaDeMais.nextInt();
        System.out.print("Digite o numero 4: ");
        n4 = contaDeMais.nextInt();
        soma = n1+n2+n3+n4;
        System.out.println("A soma dos numeros:"+soma);
    }
}
