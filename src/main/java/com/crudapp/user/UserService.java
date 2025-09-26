package com.crudapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> listAllUsers(){

        return (List<User>) userRepository.findAll(Sort.by("id").descending());
    }

    public User save(User user){

        return userRepository.save(user);
    }
}
