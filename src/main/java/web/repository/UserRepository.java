package web.repository;


import web.model.User;

import java.util.List;

public interface UserRepository {
    void addUser(User user);
    void deleteUser(Long id);
    void editUser(User user);
    User getById(Long id);
    List<User> getAllUsers();
}