package com.franklinc.colegio.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;

import com.franklinc.colegio.dto.InscripcionDTO;

public interface InscripcionService {
	public List<InscripcionDTO> list();
	public Page<InscripcionDTO> listPage();
	public InscripcionDTO findById(Integer id);
	public InscripcionDTO findByCursoNombre(String nombreCurso);
	public Page<InscripcionDTO> listBusqueda(int page, int size, String sortBy, String direction, Date fechaInicio, Date fechaFin);
	public InscripcionDTO save(InscripcionDTO inscripcionDTO);
	public InscripcionDTO update(Integer id, InscripcionDTO inscripcionDTO);
	public Boolean deleteById(Integer id);
}
