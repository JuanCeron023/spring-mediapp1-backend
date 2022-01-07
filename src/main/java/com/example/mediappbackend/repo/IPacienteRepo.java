package com.example.mediappbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mediappbackend.model.Paciente;

//@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{
	
}
