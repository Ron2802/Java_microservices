package io.brains.ratingdataservices.resourse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.brains.ratingdataservices.models.Rating;

@RestController
@RequestMapping("/ratingdata")
public class ratingResourse {

		@RequestMapping("/{movieId}")
		public Rating getrating(@PathVariable("movieId") String movieId) {
			return new Rating(movieId, 4);
		}
}
