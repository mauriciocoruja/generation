package org.generation.brazil.artemins.user;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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


}
