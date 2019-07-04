package org.generation.brazil.gfood.produto;

import java.math.BigDecimal;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRespository repository;

    // CRUD (Created)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/produtos")
    public Produto save(@RequestBody Produto produto){
        return repository.save(produto);
    }

    // CRUD (Read)
    @GetMapping("/produtos")
    public List<Produto> findAll(){
        return repository.findAll();
    }

    @PostMapping("/produtos/nome")
    public List<Produto> findByNome(@RequestParam String nome){
        return repository.findByNome(nome);
    }

    @GetMapping("/produtos/{id}")
    public Optional<Produto> findById(@PathVariable Long id){
        return repository.findById(id);
    }

    @PostMapping("/produtos/menorpreco")
    public List<Produto> findByPrecoIsBefore(@RequestParam BigDecimal preco){
        return repository.findByPrecoIsBefore(preco);
    }

    @PostMapping("/produtos/maiorpreco")
    public List<Produto> findByPrecoIsAfter(@RequestParam BigDecimal preco){
        return repository.findByPrecoIsAfter(preco);
    }

    @PostMapping("/produtos/precoentre")
    public List<Produto> findByPrecoIsBetween(@RequestParam BigDecimal precoMin, @RequestParam BigDecimal precoMax){
        return repository.findByPrecoIsBetween(precoMin, precoMax);
    }

    @PutMapping("/produtos/alterar")
    public Produto updateProduto(@RequestParam Long id, @RequestParam String nome)
        throws ResourceNotFoundException {
        return repository.findById(id).map(c -> {
            c.setNome(nome);
            return repository.save(c);
        }).orElseThrow(() ->
            new ResourceNotFoundException("Não existe produto cadastrado com o id: "+id));
    }

    // CRUD (Update)
    @PutMapping("/produtos/{id}")
    public Produto update(@PathVariable Long id, @RequestBody Produto produto)
            throws ResourceNotFoundException {
        return repository.findById(id).map(produtoAtualizado -> {
            produtoAtualizado.setNome(produto.getNome());
            produtoAtualizado.setDescricao(produto.getDescricao());
            produtoAtualizado.setPreco(produto.getPreco());
            return repository.save(produtoAtualizado);
        }).orElseThrow(() ->
                new ResourceNotFoundException("Não existe produto cadastrado com o id: "+id));
    }

    //CRUD (Delete)
    @DeleteMapping("/produtos/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
        System.out.println();
    }
}
