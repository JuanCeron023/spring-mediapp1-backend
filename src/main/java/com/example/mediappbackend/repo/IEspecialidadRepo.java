package com.example.mediappbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mediappbackend.model.Especialidad;

//@Repository
public interface IEspecialidadRepo extends JpaRepository<Especialidad, Integer>{
	
}
