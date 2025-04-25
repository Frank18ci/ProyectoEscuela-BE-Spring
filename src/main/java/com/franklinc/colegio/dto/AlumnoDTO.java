package com.franklinc.colegio.dto;

import com.franklinc.colegio.model.Alumno;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlumnoDTO {
	private Integer id;
	private String nombre;
	private String apellido;
	
	public static AlumnoDTO alumnoToAlumnoDTO(Alumno alumno) {
		return AlumnoDTO.builder()
				.id(alumno.getId())
				.nombre(alumno.getNombre())
				.apellido(alumno.getApellido())
				.build();
	}
	
}
