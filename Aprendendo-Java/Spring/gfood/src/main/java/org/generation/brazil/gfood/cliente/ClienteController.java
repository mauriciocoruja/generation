package org.generation.brazil.gfood.cliente;

import java.sql.Date;
import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {



    @Autowired
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
        return repository.findAll();
    }

    @PostMapping("/clientes/nome")
    public List<Cliente> findByNome(@RequestParam String nome){
        return repository.findByNome(nome);
    }

    @PostMapping("/clientes/datanascimento")
    public List<Cliente> findByData(@RequestParam Date datanascimento){
        return repository.findByDatanascimento(datanascimento);
    }

    @PostMapping("/clientes/nomeedata")
    public List<Cliente> findByNomeAndDatanascimento(@RequestParam String nome, @RequestParam Date datanascimento){
        return repository.findByNomeAndDatanascimento(nome, datanascimento);
    }

    @PostMapping("/cliente/busca/nome")
    public List<Cliente> findByNomeContaining(@RequestParam String nome){
        return repository.findByNomeContaining(nome);
    }

    @PutMapping("/cliente/alterar/nome")
    public Cliente update(@RequestParam String cliente){
        return (Cliente) repository.findByNomeContaining(cliente);
    }



    @PutMapping("/cliente/alterar")
    public Cliente updateCliente(@RequestParam Long id, @RequestParam String nome)
        throws ResourceNotFoundException {
        return repository.findById(id).map(c -> {
            c.setNome(nome);
            return repository.save(c);
        }).orElseThrow(() ->
            new ResourceNotFoundException("Não existe cliente cadastrado com o id: "+id));
    }


    //U do CRUD (Update)
    @PutMapping("/clientes/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente)
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

    @DeleteMapping("/cliente/deletar")
    public void deleteByNomeAndDatanascimento(@RequestParam String nome,@RequestParam Date data){
        repository.deleteByNomeAndDatanascimento(nome, data);
    }
}