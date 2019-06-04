public class Exercicio2 {
    public static void main(String[] args) {
        JogadorDeFutebol romario = new JogadorDeFutebol("Romario",100, 100, 0,0);
        JogadorDeFutebol edmundo = new JogadorDeFutebol("Edmundo",100, 100, 0,0);

        SessaoTreinamento treinoUm = new SessaoTreinamento (10);
        SessaoTreinamento treinoDois = new SessaoTreinamento (9);

        treinoUm.treinarA(romario);
        treinoDois.treinarA(edmundo);



    }
}
