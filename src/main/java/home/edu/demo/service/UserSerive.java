package home.edu.demo.service;

import home.edu.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserSerive {

    Optional<User> getUserById(Long id);

    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);

    void deleteByUsername(String username);

    void saveUser(User user);

    List<User> findAll();

}
