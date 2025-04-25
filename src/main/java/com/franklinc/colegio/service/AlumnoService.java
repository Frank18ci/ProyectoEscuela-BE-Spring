package com.franklinc.colegio.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.franklinc.colegio.dto.AlumnoDTO;

public interface AlumnoService {
	public List<AlumnoDTO> list();
	public Page<AlumnoDTO> listPage();
	public AlumnoDTO findById(Integer id);
	public AlumnoDTO findByNombre(String nombre);
	public Page<AlumnoDTO> listBusqueda(int page, int size, String sortBy, String direction, String nombre);
	public AlumnoDTO save(AlumnoDTO alumnoDTO);
	public AlumnoDTO update(Integer id, AlumnoDTO alumnoDTO);
	public Boolean deleteById(Integer id);
}
