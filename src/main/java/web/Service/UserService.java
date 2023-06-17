package web.Service;

import org.springframework.stereotype.Service;
import web.models.User;

import java.util.List;
public interface UserService {
    void addUser(User user);

    void removeUserById(int id);

    List<User> getAllUsers();

    User getUser(int id);

    void updateUser(int id, User user);

}
