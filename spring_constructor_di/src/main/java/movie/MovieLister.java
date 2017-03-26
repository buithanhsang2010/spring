package movie;

import java.util.Iterator;

import core.Movie;

public class MovieLister {

	MovieFinder movieFinder;
	public MovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	public String moviesDirectedBy() {
		String movies="";
		 Iterator<Movie> it = this.movieFinder.all().iterator();
		 while(it.hasNext()) {
			 movies = movies + it.next().getName();
		 }
		 System.out.println(movies);
		 return movies;
	}
}
