package com.ucmo.groupproject.SE5910.retailapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ucmo.groupproject.SE5910.retailapplication.models.Role;

//22.
public interface RoleRepository extends JpaRepository<Role, Long> {
    
    Role findByRole(final String role);

}
