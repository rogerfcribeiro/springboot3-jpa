package br.com.aulajpa.roger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aulajpa.roger.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
