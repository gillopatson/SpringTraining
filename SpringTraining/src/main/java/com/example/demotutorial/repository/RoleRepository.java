package com.example.demotutorial.repository;

import com.example.demotutorial.Model.Role;
import com.example.demotutorial.Rolle.EnumRolle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(EnumRolle name);
}
