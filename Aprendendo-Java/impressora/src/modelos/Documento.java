package modelos;

public class Documento implements Imprimivel {

    private String nome;
    private String tipo;

    public void imprimir(){
        System.out.println("Sou um documento do word\n"+nome+"\n"+tipo);
    }
}
