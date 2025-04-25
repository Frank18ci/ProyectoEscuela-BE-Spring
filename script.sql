create database db_colegio;

use db_colegio;

CREATE TABLE alumno (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    version BIGINT,
    estado BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE docente (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    version BIGINT,
    estado BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE curso (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    docente_id BIGINT,
    version BIGINT,
    estado BOOLEAN NOT NULL DEFAULT TRUE,
    CONSTRAINT fk_curso_docente FOREIGN KEY (docente_id) REFERENCES docente(id)
);

CREATE TABLE inscripcion (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    alumno_id BIGINT NOT NULL,
    curso_id BIGINT NOT NULL,
    fecha_inscripcion DATE NOT NULL,
    version BIGINT,
    estado BOOLEAN NOT NULL DEFAULT TRUE,
    CONSTRAINT fk_inscripcion_alumno FOREIGN KEY (alumno_id) REFERENCES alumno(id),
    CONSTRAINT fk_inscripcion_curso FOREIGN KEY (curso_id) REFERENCES curso(id)
);

-- Docentes
INSERT INTO docente (nombre, apellido, version, estado) VALUES 
('Juan', 'Pérez', 0, TRUE),
('María', 'Gómez', 0, TRUE),
('Carlos', 'López', 0, TRUE);

-- Cursos
INSERT INTO curso (nombre, docente_id, version, estado) VALUES
('Matemática', 1, 0, TRUE),
('Historia', 2, 0, TRUE),
('Biología', 3, 0, TRUE);

-- Alumnos
INSERT INTO alumno (nombre, apellido, version, estado) VALUES 
('Lucía', 'Fernández', 0, TRUE),
('Martín', 'Rodríguez', 0, TRUE),
('Sofía', 'Martínez', 0, TRUE),
('Diego', 'Suárez', 0, TRUE);

-- Inscripciones
INSERT INTO inscripcion (alumno_id, curso_id, fecha_inscripcion, version, estado) VALUES
(1, 1, '2024-03-15', 0, TRUE),
(2, 1, '2024-03-16', 0, TRUE),
(3, 2, '2024-03-17', 0, TRUE),
(4, 3, '2024-03-18', 0, TRUE),
(1, 2, '2024-03-19', 0, TRUE);


