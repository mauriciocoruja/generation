package org.generation.brazil.gfood.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);

    Optional<Object> findByData(String nome);

    Optional<Object> findByData(Object cliente);
}
