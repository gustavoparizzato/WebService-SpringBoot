package com.gustavoparizzato.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoparizzato.WebService.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
