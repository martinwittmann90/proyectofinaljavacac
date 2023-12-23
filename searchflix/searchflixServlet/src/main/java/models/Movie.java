package models;

public class Movie {
	
	private static int contador;
	
	private int idMovie;
	private String titulo;
	private int año;
	private String genero;
	private String plataforma;
	private String director;
	private String productora;
	private String actores_actrices;
	
	public Movie(String titulo, int año, String genero, String plataforma, String director, String productora, String actores_actrices) {
		this.setIdMovie(++contador);
		this.titulo = titulo;
		this.año = año;
		this.genero = genero;
		this.plataforma = plataforma;
		this.director = director;
		this.productora = productora;
		this.actores_actrices = actores_actrices;
	}
	
	public Movie(int id, String titulo, int año, String genero, String plataforma, String director, String productora, String actores_actrices) {
		super();
		this.setIdMovie(id);
		this.titulo = titulo;
		this.año = año;
		this.genero = genero;
		this.plataforma = plataforma;
		this.director = director;
		this.productora = productora;
		this.actores_actrices = actores_actrices;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Movie.contador = contador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public String getActores_actrices() {
		return actores_actrices;
	}

	public void setActores_actrices(String actores_actrices) {
		this.actores_actrices = actores_actrices;
	}

	public int getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(int idMovie) {
		this.idMovie = idMovie;
	}
}
