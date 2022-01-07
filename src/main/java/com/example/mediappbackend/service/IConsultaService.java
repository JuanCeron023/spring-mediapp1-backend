package com.example.mediappbackend.service;

import java.util.List;

import com.example.mediappbackend.dto.ConsultaListaExamenDTO;
import com.example.mediappbackend.dto.ConsultaResumenDTO;
import com.example.mediappbackend.dto.FiltroConsultaDTO;
import com.example.mediappbackend.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta>{

	Consulta registrarTransaccional(ConsultaListaExamenDTO dto);
	
	List<Consulta> buscar(FiltroConsultaDTO filtro);

	List<Consulta> buscarFecha(FiltroConsultaDTO filtro);
	
	List<ConsultaResumenDTO> listarResumen();
	
	byte[] generarReporte();
		
}
