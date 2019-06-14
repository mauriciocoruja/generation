package exercicioTres;

import exercicioTres.modelos.Aluno;

import java.util.ArrayList;

public class ExercicioTres {

    public static void main(String[] args) {
        ArrayList alunos = new ArrayList();

    /* Na classe Main, criar uma lista de alunos e adicionar quatro alunos novos.*/

        alunos.add(0,"Marica");
        alunos.add(1,"Marcelo");
        alunos.add(2,"Ana");
        alunos.add(3,"Luiz");

    /*Criar um aluno novo com um número de aluno contido na lista e perguntar
      se ele está na lista (utilizar o método contains).*/

        alunos.add(4,"Pedro");
        System.out.println(alunos.contains("Pedro"));

    /*Sobrescrever o equals da classe Aluno para que compare apenas o
      número de aluno.*/

    }
}
