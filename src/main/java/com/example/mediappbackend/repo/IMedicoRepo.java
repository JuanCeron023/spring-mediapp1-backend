package com.example.mediappbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mediappbackend.model.Medico;

//@Repository
public interface IMedicoRepo extends JpaRepository<Medico, Integer>{
	
}
