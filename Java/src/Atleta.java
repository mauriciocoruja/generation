public class Atleta {
    private String nome;
    private int nível;
    private int energia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNível() {
        return nível;
    }

    public void setNível(int nível) {
        this.nível = nível;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Atleta(String nome, int nível, int energia) {
        this.nome = nome;
        this.nível = nível;
        this.energia = energia;
    }
}
