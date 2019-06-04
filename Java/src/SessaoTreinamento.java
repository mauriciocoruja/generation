public class SessaoTreinamento {
    private int experiencia;


    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public SessaoTreinamento(int experiencia) {
        this.experiencia = experiencia;
    }



    public void treinarA(JogadorDeFutebol jogador){
        System.out.println("Experiencia inicial " + jogador.getExperiência());
        jogador.correr();
        jogador.fazerGol();
        jogador.correr();
        jogador.setExperiência(jogador.getExperiência() + this.experiencia);
        System.out.println("Experiencia final " + jogador.getExperiência());
    }
}
