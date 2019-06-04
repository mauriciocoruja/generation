public class JogadorDeFutebol {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiência;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiência() {
        return experiência;
    }

    public void setExperiência(int experiência) {
        this.experiência = experiência;
    }

    public JogadorDeFutebol(String nome, int energia, int alegria, int gols, int experiência) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiência = experiência;
    }

    public void fazerGol(){
        //this.energia = this.energia - 5;
        this.energia -= 5;
        this.alegria += 5;
        this.gols++;
        System.out.println("GOOOOL!");
    }

    public void correr(){
        this.energia -= 10;
        System.out.println("Cansei!");
    }
}
