package web.Service;

import org.springframework.stereotype.Service;
import web.models.User;

import java.util.List;
public interface UserService {
    void addUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    void getUser(int id);

}
