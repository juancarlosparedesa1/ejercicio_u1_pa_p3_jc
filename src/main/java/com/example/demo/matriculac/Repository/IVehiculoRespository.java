package com.example.demo.matriculac.Repository;

import com.example.demo.matriculac.modelo.Vehiculo;

public interface IVehiculoRespository {
	
	//C    R       U       D
	public Vehiculo insertar(Vehiculo vehiculo);
	public void buscar(String placa);
	public void actualizar(Vehiculo vehiculo);
	public void eliminar(String placa);
	

}
