package com.example.demo.matriculac.Repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculac.modelo.Matricula;
@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public Matricula insertar(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matricula matricula =new Matricula();
		matricula.setFechaMatricula(null);
		matricula.setValorMatricula(new BigDecimal(100));
		matricula.setPropietario(null);
		return matricula;
		
	}

	

}
