package infrastructure.persistence.files;

import java.util.ArrayList;

import infrastructure.persistence.IPersistence;
import models.Movie;

public class FileRepositoryImpl implements IPersistence {

	@Override
	public void saveMovie(Movie newMovie) {
	}
	@Override
	public Movie getMovieById(String idFindMovie) {
		return null;
	}
	@Override
	public ArrayList<Movie> getAll() {
		return null;
	}
	@Override
	public Movie update(Movie updateMovieData) {
		return null;
	}
	@Override
	public void delete(int id) {
	}
}