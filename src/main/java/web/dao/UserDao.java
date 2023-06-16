package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUser(int id);
}
