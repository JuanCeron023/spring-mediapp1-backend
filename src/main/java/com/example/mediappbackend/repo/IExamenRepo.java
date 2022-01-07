package com.example.mediappbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mediappbackend.model.Examen;

//@Repository
public interface IExamenRepo extends JpaRepository<Examen, Integer>{
	
}
