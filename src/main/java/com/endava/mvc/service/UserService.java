package com.endava.mvc.service;

import com.endava.mvc.dao.UserDao;
import com.endava.mvc.model.Gender;
import com.endava.mvc.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

   // private final UserDao userDao;

    public static List<User> getUsersByGender(Gender gender) {
        return UserDao.getUserByGender(gender);
    }

    public static void addUser(User user) {
        UserDao.addUser(user);
    }

    public static List<User> getAllUsers() {
        return UserDao.getAllUsers();
    }
}
