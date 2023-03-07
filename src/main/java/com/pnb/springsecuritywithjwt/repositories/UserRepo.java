package com.pnb.springsecuritywithjwt.repositories;

import com.pnb.springsecuritywithjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findUserByUserName(String userName);
}
