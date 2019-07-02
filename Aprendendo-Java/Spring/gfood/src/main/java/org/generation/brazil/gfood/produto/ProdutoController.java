package org.generation.brazil.gfood.produto;

import org.generation.brazil.gfood.cliente.Cliente;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Table;
import java.util.List;
import java.util.Optional;

@RestController
//@Table(name = "produtos")
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

    @GetMapping("/produtos/{id}")
    public Optional<Produto> findById(@PathVariable Long id){
        return repository.findById(id);
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
