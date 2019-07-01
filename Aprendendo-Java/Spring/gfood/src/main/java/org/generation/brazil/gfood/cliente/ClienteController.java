package org.generation.brazil.gfood.cliente;

import org.generation.brazil.gfood.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


//@RestController
//@Controller
//@ResponseBody


/* @GetMapping("/index")
 public String index(){
     return "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n" +
             "<ul class=\"nav justify-content-center\">\n" +
             "  <li class=\"nav-item\">\n" +
             "    <a class=\"nav-link active\" href=\"#\">Active</a>\n" +
             "  </li>\n" +
             "  <li class=\"nav-item\">\n" +
             "    <a class=\"nav-link\" href=\"#\">Link</a>\n" +
             "  </li>\n" +
             "  <li class=\"nav-item\">\n" +
             "    <a class=\"nav-link\" href=\"#\">Link</a>\n" +
             "  </li>\n" +
             "  <li class=\"nav-item\">\n" +
             "    <a class=\"nav-link disabled\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Disabled</a>\n" +
             "  </li>\n" +
             "</ul>";
 }
 @PostMapping("/post")
 public String post(){
     return "Aqui eu uso o post";
 }*/
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


