package models;

import java.util.UUID;

public class Usuario {
	
	private static int contador;
	private int idUsuario;
	private UUID idUUID;
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.idUsuario = ++contador;
		this.idUUID = UUID.randomUUID();
	}
	
	public Usuario(int id, String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.idUsuario = id;
		this.idUUID = UUID.randomUUID();
	}
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public UUID getIdUUID() {
		return idUUID;
	}
	public void setIdUUID(UUID idUUID) {
		this.idUUID = idUUID;
	}

}
