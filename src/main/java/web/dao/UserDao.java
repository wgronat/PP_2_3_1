package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUser(User user);

    User findUserByID(int id);

    void update(User updatedUser);

    void delete(int id);
}
