package org.generation.brazil.gfood.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    //R do CRUD (Read)
    @GetMapping("/clientes")
    public List<Cliente> findAll(){
        // Isso é igual a: "SELECT * FROM cliente"
        return repository.findAll();
    }

    //C DO CRUD (Create)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/clientes")
    public Cliente save(@RequestBody Cliente cliente){
        // Isso é igual a: "CREATE INTO cliente"
        return repository.save(cliente);
    }

    @DeleteMapping("/clientes/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }
}


