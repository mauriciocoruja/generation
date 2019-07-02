package org.generation.brazil.gfood.cliente;

import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {


    private ClienteRepository repository;

    //C DO CRUD (Create)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/clientes")
    public Cliente save(@RequestBody Cliente cliente){
        // Isso é igual a: "CREATE INTO cliente"
        return repository.save(cliente);
    }
    //R do CRUD (Read)
    @GetMapping("/clientes")
    public List<Cliente> findAll(){
        // Isso é igual a: "SELECT * FROM cliente"
        return (List<Cliente>) repository.findAll();
    }

    @PostMapping("/clientes/nome")
    public List<Cliente> findByNome(@RequestParam String nome){
        return repository.findByNome(nome);
    }

    @GetMapping("/clientes/{id}")
    public Optional<Cliente> findById(@PathVariable Long id){
        return repository.findById(id);
    }

    //U do CRUD (Update)
    @PutMapping("/clientes/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente)
        //TODO Verificar modo mais simples de fazer o U do CRUD
        /*return repository.findById(id).map(x ->{
            x.setNome(cliente.getNome());
            x.setEndereco(cliente.getEndereco());
            return repository.save(x);
        }).orElseGet(() ->{
            cliente.setId(id);
            return repository.save(cliente);
        });*/
    //A famigerada forma mais "facil" de fazer o U do CRUD
            throws ResourceNotFoundException {
        return repository.findById(id).map(clienteAtualizado -> {
            clienteAtualizado.setNome(cliente.getNome());
            clienteAtualizado.setEndereco(cliente.getEndereco());
            clienteAtualizado.setDatanascimento(cliente.getDatanascimento());
            return repository.save(clienteAtualizado);
        }).orElseThrow(() ->
                new ResourceNotFoundException("Não existe cliente cadastrado com o id: "+id));
    }

    //D do CRUD (Delete)
    @DeleteMapping("/clientes/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}


