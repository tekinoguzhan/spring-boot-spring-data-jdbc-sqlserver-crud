package com.otekin.dev.demo.repository;

import com.otekin.dev.demo.model.User;
import java.util.List;

public interface UserRepository {

    public User findById(Long id);

    public List<User> findAll();

    public int insert(User user);

    public int update(User user);

    public int deleteById(Long id);
}
