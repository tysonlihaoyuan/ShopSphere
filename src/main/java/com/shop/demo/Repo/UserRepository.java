package com.shop.demo.Repo;

import com.shop.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    @Query("select s from User s where s.UserEmail =?1")
    Optional<User> findUserByUserEmail(String email);
    Optional<User> findUserByUserName(String userName);
}
