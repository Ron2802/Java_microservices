package io.brains.MovieInfoServices.resourse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.brains.MovieInfoServices.models.Movie;

@RestController
@RequestMapping("/movies")
public class Movieresourse {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "test");
	}
}
