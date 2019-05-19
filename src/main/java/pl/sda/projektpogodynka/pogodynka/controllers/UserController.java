package pl.sda.projektpogodynka.pogodynka.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sda.projektpogodynka.pogodynka.repository.UserRepository;
import pl.sda.projektpogodynka.pogodynka.objects.User;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(UserController.API_USER_PATH)
public class UserController {

    static final String API_USER_PATH = "/api/user";
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public Iterable<User> getUser(){
        List<User> result = userRepository.findAll();
        return result;
    }

    @GetMapping("/{id}")
    public Optional<User> getUserByEmail(@PathVariable String id){
        return userRepository.findById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }

    @DeleteMapping("/{email}")
    public void deleteUserByEmail(@PathVariable String email){
        userRepository.deleteById(email);
    }
}
