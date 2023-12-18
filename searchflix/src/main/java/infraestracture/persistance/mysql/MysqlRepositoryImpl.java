package infraestracture.persistance.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import infraestracture.persistance.IPersistencia;
import models.Usuario;

public class MysqlRepositoryImpl implements IPersistencia {
	
	private Connection conexion;
	
	public MysqlRepositoryImpl() {
		conexion = conexionBD.getConnection();
	}

	@Override
	public void guardarUsuario(Usuario newUsuario) {
		String query = "INSERT INTO usuarios (nombre, apellido, email) VALUES (?, ?, ?)";
		
		try {
			PreparedStatement statement = conexion.prepareStatement(query);
			
			statement.setString(1, newUsuario.getNombre());
			statement.setString(2, newUsuario.getApellido());
			statement.setString(3, newUsuario.getEmail());
			
			statement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Usuario getusuarioById(String idUsuarioBuscado) {
		return null;
	}

	@Override
	public ArrayList<Usuario> getAll() {
		
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		String query = "SELECT * FROM usuarios";
		
		try {
			PreparedStatement statement = conexion.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				int id = result.getInt("id");
				String nombre = result.getString("nombre");
				String apellido = result.getString("apellido");
				String email = result.getString("email");
				
				Usuario usuario = new Usuario(id, nombre, apellido, email);
				usuarios.add(usuario);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return usuarios;
	}

	@Override
	public Usuario update(Usuario datosparaActualizar) {
		return null;
	}

	@Override
	public void delete(String id) {
	}
	

}
