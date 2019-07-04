package org.generation.brazil.gfood.produto;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ProdutoRespository extends JpaRepository<Produto, Long> {
    List<Produto> findByNome(String nome);

    List<Produto> findByPrecoIsBefore(BigDecimal preco);

    List<Produto> findByPrecoIsAfter(BigDecimal preco);

    List<Produto> findByPrecoIsBetween(BigDecimal precoMin, BigDecimal precoMax);

    @Transactional
    List<Produto> deleteByPrecoIsBetween(BigDecimal precoMin, BigDecimal precoMax);
    List<Produto> deleteByPrecoLessThan(BigDecimal preco);
}
