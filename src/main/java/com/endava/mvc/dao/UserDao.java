package com.endava.mvc.dao;

import com.endava.mvc.model.Gender;
import com.endava.mvc.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.endava.mvc.model.Gender.FEMALE;
import static com.endava.mvc.model.Gender.MALE;

@Component
public class UserDao {


     private static List<User> users = new ArrayList<>(Arrays.asList(
            new User("Ann", 21, FEMALE),
            new User("Joe", 33, MALE),
            new User("Kate", 25, FEMALE),
            new User("John", 35, MALE))
    );

    public static List<User> getUserByGender(Gender gender) {
        return users.stream()
                .filter( u -> u.getGender() == gender)
                .collect(Collectors.toList());
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static List<User> getAllUsers() {
        return users;
    }
}
