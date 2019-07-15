package org.generation.brazil.artemins.user;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    //C
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/user")
    public User create(@RequestBody User user){
        return repository.save(user);
    }

    //R
    @GetMapping("/users")
    public List<User> findAll(){
        return repository.findAll();
    }

    //R by id
    @GetMapping("/users/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return repository.findById(id);
    }

    //U
    @PutMapping("/users/{id}")
    public User update(@PathVariable Long id, @RequestBody User user)
            throws ResourceNotFoundException {
        return repository.findById(id).map(userAtualizado -> {
            userAtualizado.setNome(user.getNome());
            userAtualizado.setEmail(user.getEmail());
            userAtualizado.setLogin(user.getLogin());
            return repository.save(userAtualizado);
        }).orElseThrow(() ->
                new ResourceNotFoundException("Não existe cliente cadastrado com o id: "+id));
    }


}
