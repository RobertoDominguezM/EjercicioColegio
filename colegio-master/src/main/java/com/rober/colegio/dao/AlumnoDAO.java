package com.rober.colegio.dao;

import java.util.List;

import com.rober.colegio.dtos.Alumno;

public interface AlumnoDAO {
	
	List<Alumno> obtenerTodosAlumnos();
	List<Alumno> obtenerAlumnosporIdyNombre(String id, String nombre);
	Integer insertarAlumno(String id, String nombre, String idMunicipio);
	Integer actualizarAlumno(String idOld, String idNew, String nombre, String idMunicipio);
	Integer borrarAlumno (String id);
}
