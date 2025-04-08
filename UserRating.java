package com.lak.mit.io.movieratingservice;

import java.util.List;

public class UserRating {

	
	private List<Rating> userRatings;

	public List<Rating> getRatings() {
		return userRatings;
	}

	public void setRatings(List<Rating> userRatings) {
		this.userRatings = userRatings;
	}

	public UserRating(List<Rating> userRatings) {
		super();
		this.userRatings = userRatings;
	}
	
}
