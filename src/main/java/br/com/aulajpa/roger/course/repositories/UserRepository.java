package br.com.aulajpa.roger.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aulajpa.roger.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
