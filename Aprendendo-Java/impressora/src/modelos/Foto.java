package modelos;

public class Foto implements Imprimivel {
    private String nome;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Foto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Foto() {
    }

    public void imprimir(){
        System.out.println("Sou uma selfie\n"+nome+"\n"+tipo);
    }
}
