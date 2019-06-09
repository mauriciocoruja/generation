package modelos;

public class Contrato implements Imprimivel{

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

    public Contrato(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Contrato() {
    }

    public void imprimir(){
        System.out.println("Sou um contrato muito leal\n"+nome+"\n"+tipo);
    }


}
