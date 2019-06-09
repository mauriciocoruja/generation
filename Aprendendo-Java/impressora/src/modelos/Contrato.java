package modelos;

public class Contrato implements Imprimivel{

    private String nome;
    private String tipo;

    public void imprimir(){
        System.out.println("Sou um contrato muito leal\n"+nome+"\n"+tipo);
    }


}
