package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mappers.UsuarioMapper;
import models.Usuario;
import infraestracture.persistance.*;
import infraestracture.persistance.memory.*;
import infraestracture.persistance.mysql.MysqlRepositoryImpl;

public class SearchflixServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	IPersistencia sistemaPersistencia = new MysqlRepositoryImpl();
	UsuarioMapper mapper = new UsuarioMapper();
    public SearchflixServlets() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Usuario> listaDeUsuarios = sistemaPersistencia.getAll();
		
		String usuariosJson = mapper.toJson(listaDeUsuarios);
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		response.getWriter().write(usuariosJson);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombreInput");
		String apellido = request.getParameter("apellidoInput");
		String email = request.getParameter("emailInput");
		/*sobreescribir archivo */ response.getWriter().write("nombre de usuario:" + nombre + " " + apellido + " " + email);
		/* redireccionamiento */ //response.sendRedirect("confirmacion.html");
		Usuario usuario = new Usuario(nombre, apellido, email);
		
		IPersistencia sistemaPersistance = new MemoryRepositoryImpl();
		sistemaPersistance.guardarUsuario(usuario);
		
		UsuarioMapper mapper = new UsuarioMapper();
		
		String usuarioJson = mapper.toJson(usuario);
		
		response.getWriter().write(usuarioJson);
	}

}
