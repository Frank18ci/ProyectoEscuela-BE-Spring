package com.franklinc.colegio.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.franklinc.colegio.model.Inscripcion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InscripcionDTO {
	private Integer id;
	private Date fechaInscripcion;
	private AlumnoDTO alumno;
	private CursoDTO curso;
	public static InscripcionDTO inscripcionToInscripcionDTO(Inscripcion inscripcion) {
		return InscripcionDTO.builder()
				.id(inscripcion.getId())
				.fechaInscripcion(inscripcion.getFechaInscripcion())
				.alumno(AlumnoDTO.alumnoToAlumnoDTO(inscripcion.getAlumno()))
				.curso(CursoDTO.cursoToCursoDTO(inscripcion.getCurso()))
				.build();
	}
	public static List<InscripcionDTO> listInscripcionToListInscripcionDTO(List<Inscripcion> inscripciones){
		return inscripciones.stream().map(InscripcionDTO::inscripcionToInscripcionDTO)
				.collect(Collectors.toList());
	}
}
