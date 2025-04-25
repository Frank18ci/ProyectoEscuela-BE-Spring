package com.franklinc.colegio.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.franklinc.colegio.dto.InscripcionDTO;
import com.franklinc.colegio.model.Inscripcion;
import com.franklinc.colegio.repository.InscripcionRepository;
import com.franklinc.colegio.service.InscripcionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InscripcionServiceImpl implements InscripcionService{
	private final InscripcionRepository inscripcionRepository;
	@Override
	public List<InscripcionDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Page<InscripcionDTO> listPage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Page<InscripcionDTO> listBusqueda(int page, int size, String sortBy, String direction, Date fechaInicio,
			Date fechaFin) {
		Direction sortDirection = Direction.ASC;
		if(direction != null && "desc".equalsIgnoreCase(direction.trim()))
			sortDirection = Direction.DESC;
		Sort sort = Sort.by(sortDirection, sortBy);
		Pageable pageable = PageRequest.of(page, size, sort);
		Page<Inscripcion> inscripcionesPage = inscripcionRepository.findByFechaInscripcionBetweenAndEstadoTrue(fechaInicio, fechaFin, pageable);
		List<InscripcionDTO> inscripcionDTOs = inscripcionesPage.stream().map(InscripcionDTO::inscripcionToInscripcionDTO).collect(Collectors.toList());
		return new PageImpl<>(inscripcionDTOs, pageable, inscripcionesPage.getNumberOfElements());
	}
	@Override
	public InscripcionDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public InscripcionDTO findByCursoNombre(String nombreCurso) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public InscripcionDTO save(InscripcionDTO inscripcionDTO) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public InscripcionDTO update(Integer id, InscripcionDTO inscripcionDTO) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean deleteById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
