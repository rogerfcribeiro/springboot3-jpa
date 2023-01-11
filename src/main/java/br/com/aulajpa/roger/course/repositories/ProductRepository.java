package br.com.aulajpa.roger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aulajpa.roger.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
