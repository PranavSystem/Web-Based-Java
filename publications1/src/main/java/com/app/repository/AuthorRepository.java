package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{
	Optional<Author> findByAuthorNameAndEmail(String authName,String email);
}