package exercicioDois.modelos;

import java.util.Objects;

public class Coca {
    private Integer tamanho;
    private double preco;

    public Coca(Integer tamanho, double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coca coca = (Coca) o;
        return Double.compare(coca.preco, preco) == 0 &&
                Objects.equals(tamanho, coca.tamanho);
    }*/ //Aqui as comparações levam em conta também o preço, com isso a declaração é falsa.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coca coca = (Coca) o;
        return tamanho.equals(coca.tamanho);
    } //Aqui, está comparando apenas o tamanho, com isso a declaração é verdadeira.

    @Override
    public int hashCode() {
        return Objects.hash(tamanho, preco);
    }
}
