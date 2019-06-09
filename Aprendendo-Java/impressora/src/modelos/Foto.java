package modelos;

public class Foto implements Imprimivel {
    private String nome;
    private String tipo;

    public void imprimir(){
        System.out.println("Sou uma selfie\n"+nome+"\n"+tipo);
    }
}
