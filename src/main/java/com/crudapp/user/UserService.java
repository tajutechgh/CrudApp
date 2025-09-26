package com.crudapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

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

    public User get(int userId) throws UserNotFoundException{

        try {

            return userRepository.findById(userId).get();

        }catch (NoSuchElementException exception){

            throw new UserNotFoundException("User with the ID: " + userId + " not found!");
        }
    }

    public void delete(int userId) throws UserNotFoundException {

        int countId = userRepository.countById(userId);

        if (countId == 0 || userId == 0){

            throw new UserNotFoundException("User with the ID: " + userId + " not found!");
        }

        userRepository.deleteById(userId);
    }
}
