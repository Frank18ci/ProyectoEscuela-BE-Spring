package com.franklinc.colegio.repository;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franklinc.colegio.model.Inscripcion;

@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion, Integer>{
	Page<Inscripcion> findByFechaInscripcionBetweenAndEstadoTrue(Date fechaI, Date fechaF, Pageable pageable);
}
