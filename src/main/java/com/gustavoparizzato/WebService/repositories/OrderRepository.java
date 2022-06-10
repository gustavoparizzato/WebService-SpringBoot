package com.gustavoparizzato.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoparizzato.WebService.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
