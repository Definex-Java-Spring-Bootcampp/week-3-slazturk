package com.onlineShopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.onlineShopping.exceptions.ExceptionMessages;
import com.onlineShopping.exceptions.OnlineShoppingException;
import com.onlineShopping.model.User;
import com.onlineShopping.repository.UserRepository;


import lombok.RequiredArgsConstructor;

@Service
@Scope(value = "singleton")
@RequiredArgsConstructor
public class UserService {

	private UserRepository userRepository = new UserRepository();

    public User save(User user) {
        System.out.println("userRepository: " + userRepository.hashCode());

        userRepository.save(user);

        return user;
    }
    public List<User> getAll() {
        System.out.println("userRepository: " + userRepository.hashCode());
        return userRepository.getAll();
    }


    public User getByEmail(String email) {

        Optional<User> foundUser = userRepository.findByEmail(email);

        User user = foundUser.orElseThrow(() -> new OnlineShoppingException(ExceptionMessages.USER_NOT_FOUND));

        if (foundUser.isPresent()) {
            user = foundUser.get();
        }

        //throw new RuntimeException();

        // throw new NullPointerException();

         throw new IllegalArgumentException("exception fırlatıldı");

        // throw new ArithmeticException();

       // return user;

    }
}
