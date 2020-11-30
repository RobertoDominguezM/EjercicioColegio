package com.rober.colegio.utils;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.rober.colegio.dao.CombosDAO;
import com.rober.colegio.dao.impl.CombosDAOImpl;
import com.rober.colegio.dtos.ComboDTO;

public class ComboUtils {

	
	public static void recuperacionComboMunicipios(HttpServletRequest request) {
		CombosDAO comboMunicipio = new CombosDAOImpl();
		List<ComboDTO> listaMunicipios = comboMunicipio.comboMunicipios();
		request.setAttribute("comboMunicipios", listaMunicipios);
	}
}
