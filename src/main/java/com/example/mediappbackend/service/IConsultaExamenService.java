package com.example.mediappbackend.service;

import java.util.List;

import com.example.mediappbackend.model.ConsultaExamen;

public interface IConsultaExamenService {

	List<ConsultaExamen> listarExamenesPorConsulta(Integer idconsulta);
}
