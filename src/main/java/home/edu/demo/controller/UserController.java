package home.edu.demo.controller;

import home.edu.demo.model.User;
import home.edu.demo.service.UserSerive;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserSerive userSerive;

    public UserController(UserSerive userSerive) {
        this.userSerive = userSerive;
    }

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody User user){
        userSerive.saveUser(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id){
        User user = userSerive.getUserById(id).get();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(user);
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> users = userSerive.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(users);
    }


}
