package modelo;

public class Animal {
    private String nome;
    private String dono;
    private int idade;


    //Obter e setar dono
    public String getDono(){
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }


    //Obter e setar nome
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Obter e setar idade
    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public Animal(String nome, int idade, String dono){
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }

    public boolean mamifero(){
        return true;
    }


}
