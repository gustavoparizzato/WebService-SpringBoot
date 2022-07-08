package com.gustavoparizzato.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoparizzato.WebService.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
