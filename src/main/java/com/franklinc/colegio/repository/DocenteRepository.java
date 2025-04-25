package com.franklinc.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franklinc.colegio.model.Docente;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Integer>{

}
