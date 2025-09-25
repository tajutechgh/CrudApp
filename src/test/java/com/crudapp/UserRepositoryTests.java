package com.crudapp;

import com.crudapp.user.User;
import com.crudapp.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Date;
import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void createUser(){

        User user = new User();

        user.setFirstName("Koo");
        user.setLastName("Manu");
        user.setDateOfBirth(new Date(2020, 12, 20));
        user.setEmailAddress("koo@gmail.com");
        user.setPhoneNumber("0242760448");

        User savedUser = userRepository.save(user);

        assertThat(savedUser.getId()).isGreaterThan(0);
    }

    @Test
    public void listAllUsers(){

        Iterable<User> listUsers = userRepository.findAll();

        listUsers.forEach(user -> System.out.println(user));
    }

    @Test
    public void getUserById(){

        int userId = 1;

        User user = userRepository.findById(userId).get();

        assertThat(user).isNotNull();
    }

    @Test
    public void updateUser(){

        int userId = 2;

        User user = userRepository.findById(userId).get();

        user.setPhoneNumber("0259870653");

        User updateUser = userRepository.save(user);

        assertThat(updateUser.getPhoneNumber()).isEqualTo("0259870653");
    }

    @Test
    public void deleteUser(){

        int userId = 4;

        userRepository.deleteById(userId);
    }
}
