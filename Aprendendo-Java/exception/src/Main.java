import modelo.Pessoa;

public class Main {

    public static void main(String[] args) {
        try {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(17);
            if (pessoa.getIdade() >= 18) {
                System.out.println("Você é maior de idade");
            }else {
                System.out.println("Você é menor de idade");
            }

            /*
            Integer i = 0;

            if (9 / i == 9){
                System.out.println("Jamais entrará aqui");
            }
            */

        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Caiu na dentro do catch, ou seja, na excessão!");
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Caiu na dentro do segundo catch, ou seja, na segunda excessão!");
        } finally {
            System.out.println("Sempre será executado");
        }

        System.out.println("Segue o jogo");
    }
}
