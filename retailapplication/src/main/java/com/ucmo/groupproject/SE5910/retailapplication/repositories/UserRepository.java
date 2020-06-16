package com.ucmo.groupproject.SE5910.retailapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ucmo.groupproject.SE5910.retailapplication.models.User;

//21.
public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByEmail(final String email);

}
