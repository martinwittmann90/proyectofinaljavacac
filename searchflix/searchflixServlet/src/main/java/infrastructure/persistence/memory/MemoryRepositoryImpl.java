package infrastructure.persistence.memory;

import java.util.ArrayList;
import java.util.List;

import infrastructure.persistence.*;
import models.Movie;

public class MemoryRepositoryImpl implements IPersistence {

	private static List<Movie> movieSaved = new ArrayList<>();
	
	@Override
	public void saveMovie(Movie newMovie) {
		
		MemoryRepositoryImpl.movieSaved.add(newMovie);
		System.out.println("PELICULA GUARDADO EN MEMORIA ...");
	}

	@Override
	public Movie getMovieById(String idFindMovie) {
		
		 int index = Integer.parseInt(idFindMovie) - 1;
	        if (index >= 0 && index < movieSaved.size()) {
	            return movieSaved.get(index);
	        }
	        return null;
		
	}

	@Override
	public ArrayList<Movie> getAll() {
		return new ArrayList<>(movieSaved);
	}

	@Override
	public Movie update(Movie updateMovieData) {
		
		for (Movie movie : movieSaved) {
            if (movie.getIdMovie() == (updateMovieData.getIdMovie())) {
                // Actualizar los datos del movie
                movie.setTitulo(updateMovieData.getTitulo());
                movie.setAño(updateMovieData.getAño());
				movie.setGenero(updateMovieData.getGenero());
				movie.setPlataforma(updateMovieData.getPlataforma());
				movie.setDirector(updateMovieData.getDirector());
				movie.setProductora(updateMovieData.getProductora());
				movie.setActores_actrices(updateMovieData.getActores_actrices());
				
                return movie;
            }
        }
        return null;
	}

	@Override
	public void delete(int id) {
		
		movieSaved.removeIf(movie -> movie.getIdMovie()==(id));
		
	}

}
