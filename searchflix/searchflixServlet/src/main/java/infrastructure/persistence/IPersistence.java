package infrastructure.persistence;

import java.util.ArrayList;

import models.Movie;

public interface IPersistence {
	
	// CRUD
	
	// CREATE
	void saveMovie(Movie newMovie);
	
	// READ
	Movie getMovieById(String idFindMovie);
	ArrayList<Movie> getAll();
	
	// UPDATE
	Movie update(Movie updateMovieData);
	
	// DELETE
	void delete(int id);
	
}
