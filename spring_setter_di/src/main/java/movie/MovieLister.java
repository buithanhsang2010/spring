package movie;

import java.io.IOException;
import java.util.Iterator;

import core.Movie;

public class MovieLister {

	MovieFinder movieFinder;
	
	public MovieLister() {
		this.movieFinder = null;
	}
	
	public void setMovieFinder(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	public MovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	public String moviesDirectedBy() throws IOException {
		String movies="";
		 Iterator<Movie> it = this.movieFinder.all().iterator();
		 while(it.hasNext()) {
			 movies = movies + it.next().getName();
		 }
		 System.out.println(movies);
		 return movies;
	}
}
