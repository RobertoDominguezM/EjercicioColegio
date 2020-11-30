package com.rober.colegio.dao;

import java.util.List;

import com.rober.colegio.dtos.Alumno;
import com.rober.colegio.dtos.Asignatura;

public interface AsignaturaDAO {
	List<Asignatura> obtenerAsignaturas(String id, String nombre, String curso);
	int insertarAsignaturas(String id, String nombre, String curso);
}
