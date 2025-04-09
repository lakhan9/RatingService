package com.lak.mit.io.movieratingservice;

public class Rating {
	
	private String movieId;
	private String rating;
	private String cast;
	public Rating() {};
	public Rating(String movieId, String rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	
	public String getmovieId() {
		return movieId;
	}
	public void setmovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}

	
	

}
