package com.franklinc.colegio.dto;

import com.franklinc.colegio.model.Curso;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CursoDTO {
	private Integer id;
	private String nombre;
	private DocenteDTO docente;
	public static CursoDTO cursoToCursoDTO(Curso curso) {
		return CursoDTO.builder()
				.id(curso.getId())
				.nombre(curso.getNombre())
				.docente(DocenteDTO.docenteToDocenteDTO(curso.getDocente()))
				.build();
	}
}
