package com.gustavoparizzato.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoparizzato.WebService.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
