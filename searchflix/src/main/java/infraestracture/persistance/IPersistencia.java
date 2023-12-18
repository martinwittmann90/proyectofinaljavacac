package infraestracture.persistance;

import java.util.ArrayList;

import models.Usuario;

public interface IPersistencia {
	
	//CREATE
	void guardarUsuario (Usuario newUsuario);
	
	//READ
	Usuario getusuarioById (String idUsuarioBuscado);
	ArrayList<Usuario> getAll();
	
	//UPDATE
	Usuario update(Usuario datosparaActualizar);
	
	//DELETE
	void delete(String id);
	

}
