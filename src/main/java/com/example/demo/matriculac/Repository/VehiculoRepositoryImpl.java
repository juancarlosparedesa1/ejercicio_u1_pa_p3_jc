package com.example.demo.matriculac.Repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculac.modelo.Vehiculo;
@Repository

public class VehiculoRepositoryImpl implements IVehiculoRespository {

	@Override
	public Vehiculo insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el vehiculo: "+vehiculo);
		///////////////////////////////////////////////////////////
		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setMarca("volkswagen");
		vehiculo1.setPlaca("PAA 001");
		vehiculo1.setTipo("Liviano");
		vehiculo1.setPrecio(new BigDecimal(1000));
		return vehiculo1;
	}

	@Override
	public void buscar(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el vehiculo:"+vehiculo);
		
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el vehiculo:"+placa);
		
	}

}
