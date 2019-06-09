package exercicioUm.modelos;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer rg;

    public Pessoa(String nome, Integer rg) {
        this.nome = nome;
        this.rg = rg;
    }


    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(rg, pessoa.rg);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return rg.equals(pessoa.rg);
    } //Com esse contrutor, a comparação se torna verdadeira, pois os numeros dos RGs são identicos e apenas isso está sendo comparado.



    @Override
    public int hashCode() {
        return Objects.hash(nome, rg);
    }
}
