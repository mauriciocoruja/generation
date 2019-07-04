package org.generation.brazil.gfood.cliente;


import java.sql.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

  // SELECT * FROM CLIENTE WHERE NOME = :NOME;
  List<Cliente> findByNome(String nome);

  // SELECT * FROM CLIENTE WHERE DATANASCIMENTO = DATANASCIMENTO;
  List<Cliente> findByDatanascimento(Date datanascimento);

  // SELECT * FROM CLIENTE WHERE NOME
  List<Cliente> findByNomeAndDatanascimento(String nome, Date datanascimento);

  List<Cliente> findByNomeContaining(String nome);

  @Transactional
  @Modifying
  List<Cliente> deleteByNomeAndDatanascimento(String nome, Date data);
}
