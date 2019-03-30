package pl.sdacademy.javaktw9.carRental.controller;

import org.springframework.web.bind.annotation.*;
import pl.sdacademy.javaktw9.carRental.repository.UserRepository;
import pl.sdacademy.javaktw9.carRental.model.User;

import java.util.List;
@RestController
@RequestMapping("/user")
public class UserController {
    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }
}