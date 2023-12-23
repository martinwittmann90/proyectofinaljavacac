package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import infrastructure.persistence.*;
import infrastructure.persistence.mysql.MysqlRepositoryImpl;
import mappers.MovieMapper;
import models.Movie;

public class searchflixServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	// IPersistence persistenceSistem = new MemoryRepositoryImpl();
	// IPersistence persistenceSistem = new FileRepositoryImpl();
	IPersistence persistenceSistem = new MysqlRepositoryImpl();
	MovieMapper mapper = new MovieMapper();

	public searchflixServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Movie> listOfMovies = ((MysqlRepositoryImpl) persistenceSistem).getAll();

		String movieJson = mapper.toJson(listOfMovies);

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		response.getWriter().write(movieJson);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println("Entrando al bloque doPost");
	        System.out.println("Parámetros de la solicitud:");
	        Enumeration<String> parameterNames = request.getParameterNames();
	        while (parameterNames.hasMoreElements()) {
	            String paramName = parameterNames.nextElement();
	            System.out.println(paramName + ": " + request.getParameter(paramName));
	        }
			
			String titulo = (request.getParameter("tituloInput") != null) ? request.getParameter("tituloInput") : "";
			String añoStr = request.getParameter("añoInput");
			int año = (añoStr != null && !añoStr.isEmpty()) ? Integer.parseInt(añoStr) : 2000;
			String genero = request.getParameter("generoInput");
			String plataforma = request.getParameter("plataformaInput");
			String director = request.getParameter("directorInput");
			String productora = request.getParameter("productoraInput");
			String actores_actrices = request.getParameter("actores_actricesInput");

			System.out.println("titulo: " + titulo);
			System.out.println("año: " + año);
			System.out.println("genero: " + genero);
			System.out.println("plataforma: " + plataforma);
			System.out.println("director: " + director);
			System.out.println("productora: " + productora);
			System.out.println("actores_actrices: " + actores_actrices);

			Movie movie = new Movie(titulo, año, genero, plataforma, director, productora, actores_actrices);

			persistenceSistem.saveMovie(movie);

			MovieMapper mapper = new MovieMapper();

			String movieJson = mapper.toJson(movie);

			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(movieJson);
			System.out.println("nombre de movie: " + titulo + " " + plataforma);
			System.out.println("Respuesta del servidor: " + movieJson);

		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("Error al procesar la solicitud: " + e.getMessage());
		}

	}

}
