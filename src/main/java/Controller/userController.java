package Controller;

import Entity.User;
import model.dto.Userdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.List;

@RestController
public class userController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> getListUsers() {
        List<Userdto> users = userService.getListUser();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(users);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id) {
        Userdto result = userService.getUserById(id);
        return ResponseEntity.ok(result);

    }
    @PostMapping("/user")
    public ResponseEntity<?> createUser() {
        return null;
    }
    @PutMapping("/user/{id}")
    public ResponseEntity<?> updateUser() {
        return null;
    }
    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> delateUser() {
        return null;
    }
}
