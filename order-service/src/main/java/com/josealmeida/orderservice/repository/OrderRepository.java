package com.josealmeida.orderservice.repository;

import com.josealmeida.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}