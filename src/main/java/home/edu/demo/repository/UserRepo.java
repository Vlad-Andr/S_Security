package home.edu.demo.repository;

import home.edu.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    void deleteByUsername(String username);

    List<User> findAll();
}
