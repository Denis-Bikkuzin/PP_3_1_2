package org.example.pp_3_1_2.service;


import org.example.pp_3_1_2.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    void deleteUser(int id);

    User getUser(int id);

    void updateUser(User user);
}
