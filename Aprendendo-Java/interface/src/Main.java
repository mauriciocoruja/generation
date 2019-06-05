import funcionario.Gerente;

public class Main {

    public static void main(String[] args) {
        Gerente maria = new Gerente();
        maria.setNome("Maria José");
        System.out.println(maria);

        Gerente jose = new Gerente();
        jose.setNome("José Maria");
        System.out.println(jose);

        if (maria.equals(jose)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
    }
}
