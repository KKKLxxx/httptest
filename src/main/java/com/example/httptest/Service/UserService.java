package com.example.httptest.Service;

import com.example.httptest.Entity.User;
import com.example.httptest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public boolean register(String userId, String password)
    {
        List<User> users = userRepository.findAll();
        for (User user : users)
        {
            if (user.getUserId().equals(userId))
                return false;
        }

        User user = new User();
        user.setUserId(userId);
        user.setPassword(password);
        userRepository.save(user);
        return true;
    }

    public User loginCheck(String userId, String password)
    {
        return userRepository.findByUserIdAndPassword(userId, password);
    }
}
