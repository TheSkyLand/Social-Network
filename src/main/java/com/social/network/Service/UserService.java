package com.social.network.Service;

import com.social.network.Models.User;
import com.social.network.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class  UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id)
    {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user){
     return userRepository.save(user);
    }
}