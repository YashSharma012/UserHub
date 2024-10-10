package com.yash.UserHub.service;

import com.yash.UserHub.model.User;
import com.yash.UserHub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //List User
    public List<User> findAll() {
        return userRepository.findAll();
    }

    // Add a user
    public User save(User user) {
        Optional<User> getUser = Optional.of(userRepository.save(user));
        return getUser.get();
    }

    // Find user by ID
    public User findById(long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    // Delete user by ID
    public void deleteByID(Long id) {
        userRepository.deleteById(id);
    }

}
