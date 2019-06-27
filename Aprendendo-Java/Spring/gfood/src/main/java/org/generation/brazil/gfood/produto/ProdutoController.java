package org.generation.brazil.gfood.produto;

import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRespository repository;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/produtos")
    public Produto save(@RequestBody Produto produto){
        return repository.save(produto);
    }

    @GetMapping("/produtos")
    public List<Produto> findAll(){
        return repository.findAll();
    }

    @PutMapping("/Produto/{id}")
    public Produto update(@PathVariable Long id, @RequestBody Produto produto)
            throws ResourceNotFoundException {
        return repository.findById(id).map(produtoAtualizado -> {
            produtoAtualizado.setNome(produto.getNome());
            produtoAtualizado.setDescricao(produto.getDescricao());
            return repository.save(produtoAtualizado);
        }).orElseThrow(() ->
                new ResourceNotFoundException("Não existe cliente cadastrado com o id: "+id));
    }


}
