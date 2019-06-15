package exercicio4.modelos;

import java.util.List;
import java.util.Map;

/*2. Criar a classe GuardaVolumes, que contenha como variável um dicionário
e um contador que será utilizado como identificador. As chaves do
dicionário serão Integer e, como valor, haverá uma lista de peças.*/

public class GuardaVolumes {
    private Map<Integer, List<Peca>> dicionario;
    private Integer contador;

/*3. Criar o método public Integer guardarPecas(List<Peca> listaDePeca) na
Classe GuardaVolumes, que recebe uma lista de peças adiciona essa lista
de peças em nosso dicionário e retorna o número de identificação, ou seja,
a chave do dicionário onde guardamos as peças, que neste caso é o nosso
contador.*/

    public Integer guardarPecas(List<Peca> listaDePeca){
        this.dicionario.put(this.contador, listaDePeca);
        return this.contador += 1;
    }

}


