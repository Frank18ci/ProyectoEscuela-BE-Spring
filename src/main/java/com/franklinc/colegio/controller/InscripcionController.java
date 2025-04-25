package com.franklinc.colegio.controller;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.franklinc.colegio.service.InscripcionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("inscripcion")
@RequiredArgsConstructor
public class InscripcionController {
	private final InscripcionService inscripcionService;
	@GetMapping("/busqueda")
	public ResponseEntity<?> buscarPorFechas(
			@RequestParam  @DateTimeFormat(iso = ISO.DATE) LocalDate fechaInicio,
			@RequestParam @DateTimeFormat(iso = ISO.DATE) LocalDate fechaFin,
			@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "2") int size,
			@RequestParam(defaultValue = "id") String sortBy,
			@RequestParam(defaultValue = "asc") String direction
			) {
		Date fechaI = Date.from(fechaInicio.atStartOfDay(ZoneId.systemDefault()).toInstant());
		Date fechaF = Date.from(fechaFin.atStartOfDay(ZoneId.systemDefault()).toInstant());
		return ResponseEntity.status(HttpStatus.OK).body(inscripcionService.listBusqueda(page, size, sortBy, direction, fechaI, fechaF));
	}
	
}
