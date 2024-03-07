package com.dailycodeword.lakeSidehotel.service.User;

import com.dailycodeword.lakeSidehotel.model.User;

import java.util.List;

public interface UserService {

    User registerUser(User user);

    List<User> getUsers();

    void deleteUser(String email);

    User getUser(String email);

}
