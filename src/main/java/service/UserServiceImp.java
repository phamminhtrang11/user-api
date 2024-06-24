package service;

import Entity.User;
import exception.NotFoundException;
import model.dto.Userdto;
import model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImp implements UserService{

    private static ArrayList<User> users = new ArrayList<User>();
    static {
        users.add(new User(1, "a", "abc"));
        users.add(new User(2, "b", "cde"));
    }


    @Override
    public List<Userdto> getListUser() {
        List<Userdto> result = new ArrayList<Userdto>();
        for (User user: users) {
            result.add(UserMapper.toUserdto(user));
        }
        return result;
    }

    @Override
    public Userdto getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return UserMapper.toUserdto(user);
            }
        }
        throw new NotFoundException("user not exist");
    }
    @Override
    public User updateUser(int id, User updatedUser) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                return user;
            }
        }
        throw new NotFoundException("User does not exist");
    }

    @Override
    public Userdto deleteUser(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
                return UserMapper.toUserdto(user);
            }
        }
        throw new NotFoundException("User does not exist");
    }
    @Override
    public User createUser(User user) {
        users.add(user);
        return user;
    }
}
