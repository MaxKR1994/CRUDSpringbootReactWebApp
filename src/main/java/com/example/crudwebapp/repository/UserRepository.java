package com.example.crudwebapp.repository;

import com.example.crudwebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
