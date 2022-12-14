package com.example.demo.matriculac.Repository;

import com.example.demo.matriculac.modelo.Propietario;

public interface IPropietarioRepository {

	//C    R       U       D
		public Propietario insertar(Propietario propietario);
//		public void buscar(String cedula);
//		public void actualizar(Propietario propietario);
		public void eliminar(String placa);
}
