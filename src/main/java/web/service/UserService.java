package web.service;

import web.models.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User findUserByID(int id);

    public void update(User updatedUser);

    public void delete(int id);
}
