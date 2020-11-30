package com.rober.colegio.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.rober.colegio.dtos.Asignatura;
import com.rober.colegio.utils.DBUtils;

public class AsignaturaDAOImpl {
	public List<Asignatura> obtenerTodasAsignaturas() {

		List<Asignatura> listaAsignaturas = new ArrayList<>();

		try {
			Connection connection = DBUtils.DBConnection();
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM ALUMNOS");

			while (rs.next()) {
				Asignatura a = new Asignatura(rs.getInt(1), rs.getString(2), "", 0);
				listaAsignaturas.add(a);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaAsignaturas;
	}

	public List<Asignatura> obtenerAsignaturaporIdNombreyCurso(Integer id, String nombre, String curso) {
		
		String sql = "SELECT a.id, a.nombre, m.nombre, m.id_municipio " + "FROM alumnos a, municipios m " + "WHERE  a.id_municipio = m.id_municipio " + "AND a.id LIKE ? AND a.nombre LIKE ?";

		ResultSet asignaturaResultSet = null;
		Connection connection = DBUtils.DBConnection();
		List<Asignatura> listaAsignaturas = new ArrayList<>();

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, "%" + id + "%");
			ps.setString(2, "%" + nombre + "%");

			asignaturaResultSet = ps.executeQuery();

			while (asignaturaResultSet.next()) {
				Asignatura a = new Asignatura(asignaturaResultSet.getInt(1), asignaturaResultSet.getString(2),asignaturaResultSet.getString(3), asignaturaResultSet.getInt(4));
				listaAsignaturas.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaAsignaturas;
	}
}
