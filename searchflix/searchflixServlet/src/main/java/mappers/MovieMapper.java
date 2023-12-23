package mappers;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.Movie;

public class MovieMapper {
	
	ObjectMapper mapper;

	public MovieMapper() {
		this.mapper = new ObjectMapper();
		
	}
	
	public String toJson(Movie movie) {
		try {
			return mapper.writeValueAsString(movie);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	public String toJson(ArrayList<Movie> movieList) {
		
		try {
            return mapper.writeValueAsString(movieList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "[]"; 
        }
	}

}
