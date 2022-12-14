package com.example.demo.matriculac.Repository;

import org.springframework.stereotype.Repository;

import com.example.demo.matriculac.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	
//	 public static List<Propietario>=new Propietario List<>();
	@Override
	public Propietario insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		
		Propietario propietario1 = new Propietario();
		propietario1.setNombre("Juan Carlos");
		propietario1.setApellido("Paredes");
		propietario1.setCedula("1762689729");
		propietario1.setFechaNacimiento(null);
		return propietario1;
	}

//	@Override
//	public void buscar(String cedula) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void actualizar(Propietario propietario) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el propietario:");
	}

}
