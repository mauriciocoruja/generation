public class Exercicio3 {
    public static void main(String[] args) {
        Atleta bolt = new Atleta("Bolt",3,20);
        Atleta serena = new Atleta("Serena",3,25);

        Prova provaUm = new Prova(1,3,"físico");
        Prova provaDois = new Prova(2, 6,"recreativo");
        Prova provaTres = new Prova(3, 9, "força");

        provaUm.podeRealizar(bolt);
        provaDois.podeRealizar(bolt);
        provaTres.podeRealizar(bolt);


        provaUm.podeRealizar(serena);
        provaDois.podeRealizar(serena);
        provaTres.podeRealizar(serena);

    }
}
