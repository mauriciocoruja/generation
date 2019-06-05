package modelo;

public abstract class Animal {
    private String nome;
    private Integer idade;
    private String especie;
    private char sexo; // 'f' - fêmea e 'm' - macho

    public abstract void respirar();
    public abstract void comer();
}
