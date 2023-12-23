package infrastructure.persistence.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import infrastructure.persistence.IPersistence;
import models.Movie;

public class MysqlRepositoryImpl implements IPersistence {

    private Connection connection;

    public MysqlRepositoryImpl() {
        try {
			this.connection = connectionDB.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    @Override
    public void saveMovie(Movie newMovie) {
        String query = "INSERT INTO peliculas (titulo, año, genero, plataforma, director, productora, actores_actrices) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, newMovie.getTitulo());
            statement.setInt(2, newMovie.getAño());
            statement.setString(3, newMovie.getGenero());
            statement.setString(4, newMovie.getPlataforma());
            statement.setString(5, newMovie.getDirector());
            statement.setString(6, newMovie.getProductora());
            statement.setString(7, newMovie.getActores_actrices());

            statement.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Movie getMovieById(String idFindMovie) {
        return null;
    }

    @Override
    public ArrayList<Movie> getAll() {

        ArrayList<Movie> movies = new ArrayList<>();

        String query = "SELECT * FROM peliculas";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt("id");
                String titulo = result.getString("titulo");
                int año = result.getInt("año");
                String genero = result.getString("genero");
                String plataforma = result.getString("plataforma");
                String director = result.getString("director");
                String productora = result.getString("productora");
                String actores_actrices = result.getString("actores_actrices");

                Movie movie = new Movie(id, titulo, año, genero, plataforma, director, productora, actores_actrices);
                movies.add(movie);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return movies;
    }

    @Override
    public Movie update(Movie updateMovieData) {
        return null;
    }

    @Override
    public void delete(int id) {
    }
}

