package service;

import Entity.User;
import model.dto.Userdto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<Userdto> getListUser();
    public Userdto getUserById(int id);

    User updateUser(int id, User updatedUser);

    Userdto deleteUser(int id);

    User createUser(User user);
}
