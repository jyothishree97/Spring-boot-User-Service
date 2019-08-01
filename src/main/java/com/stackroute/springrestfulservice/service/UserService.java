package com.stackroute.springrestfulservice.service;

import com.stackroute.springrestfulservice.domain.User;

public interface UserService {

    public User saveUser(User user);

    public User getUserById(int id);
}
