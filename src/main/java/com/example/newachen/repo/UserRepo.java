package com.example.newachen.repo;

import com.example.newachen.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "select * from USERS where email=?1", nativeQuery = true)
    Optional<User> findByEmail(String email);

}
