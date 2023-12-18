package infraestracture.persistance.memory;

import java.util.ArrayList;
import java.util.List;

import infraestracture.persistance.*;
import models.Usuario;

public class MemoryRepositoryImpl implements IPersistencia {
	
	private static List<Usuario> usuarioGuardados = new ArrayList<>();

	@Override
	public void guardarUsuario(Usuario newUsuario) {
		MemoryRepositoryImpl.usuarioGuardados.add(newUsuario);
		
	}

	@Override
	public Usuario getusuarioById(String idUsuarioBuscado) {
		Usuario usuario = MemoryRepositoryImpl.usuarioGuardados.get(Integer.parseInt(idUsuarioBuscado) - 1);
		return usuario;
	}

	@Override
	public ArrayList<Usuario> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario update(Usuario datosparaActualizar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	

}
