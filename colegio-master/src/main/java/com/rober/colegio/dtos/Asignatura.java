package com.rober.colegio.dtos;

public class Asignatura {
	private Integer id;
	private String nombre;
	private Integer curso;
	
	/**
	 * 
	 */
	public Asignatura(int i, String string, String string2, int m) {
		super();
	}
	/**
	 * @param id
	 * @param nombre
	 * @param curso
	 */
	public Asignatura(Integer id, String nombre, Integer curso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the curso
	 */
	public Integer getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Integer curso) {
		this.curso = curso;
	}
}
