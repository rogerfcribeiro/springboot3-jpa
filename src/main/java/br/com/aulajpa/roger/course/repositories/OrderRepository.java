package br.com.aulajpa.roger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aulajpa.roger.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
