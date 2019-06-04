public class Prova {
    private int dificuldade;
    private int energiaNecessaria;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public Prova(int dificuldade, int energiaNecessaria, String nome) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
        this.nome = nome;
    }

    public void podeRealizar(Atleta x){
        if ((x.getEnergia()>= energiaNecessaria )&&(x.getNível()>= dificuldade)){
            System.out.println(x.getNome()+" pode realizar com o treino " + nome + " com tranquilidade");
        }else{
            System.out.println(x.getNome()+" Não pode realizar esse treino");
        }
    }
}
