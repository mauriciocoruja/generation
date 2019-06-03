public class Cliente {
    private String nome;
    private String sobrenome;

    public String getNome(){
        return nome;
    }

    //O get pode ser ignorado nesse caso, pois o construtor substitui essa função.
    /*
    public void setNome(String nome) {
        this.nome = nome;
    }
    */

    public String getSobrenome(){
        return sobrenome;
    }

    //O get pode ser ignorado nesse caso, pois o construtor substitui essa função.
    /*
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    */
    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
}
