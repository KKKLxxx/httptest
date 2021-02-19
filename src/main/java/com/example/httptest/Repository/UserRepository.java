package com.example.httptest.Repository;

import com.example.httptest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>
{
    User findByUserIdAndPassword(String userId, String password);

}
