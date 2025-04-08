package com.lak.mit.io.movieratingservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class MovieRatingController {
	

	@GetMapping(path="/{movieId}")
	public Rating getInfo(@PathVariable String movieId){
		return new Rating( movieId, "4");	
	}	
	
	@GetMapping(path="movieId")
	public Rating getInfo(){
		return new Rating( "movie", "4");
		
	}	
	
	@GetMapping(path="/user/{userId}")
	public UserRating getUser(@PathVariable String userId){
		
		List<Rating> ratingList = Arrays.asList(
				new Rating("1234","5"),
				new Rating("5678","6")
			);
		
		return new UserRating(ratingList);
		
		
		
	}	
}
