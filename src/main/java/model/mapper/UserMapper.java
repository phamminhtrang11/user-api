package model.mapper;

import Entity.User;
import model.dto.Userdto;

//de tai su dung code
public class UserMapper {
    public static Userdto toUserdto(User user) {
        Userdto tmp = new Userdto();
        tmp.setId(user.getId());
        tmp.setName(user.getName());
        return tmp;
    }
}
