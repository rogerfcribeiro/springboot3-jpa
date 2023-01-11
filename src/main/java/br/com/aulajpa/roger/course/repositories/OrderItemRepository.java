package br.com.aulajpa.roger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aulajpa.roger.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}
