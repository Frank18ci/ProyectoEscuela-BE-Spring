package com.franklinc.colegio.dto;

import com.franklinc.colegio.model.Docente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocenteDTO {
	private Integer id;
	private String nombre;
	private String apellido;
	public static DocenteDTO docenteToDocenteDTO(Docente docente) {
		return DocenteDTO.builder()
				.id(docente.getId())
				.nombre(docente.getNombre())
				.apellido(docente.getApellido())
				.build();
	}
}
