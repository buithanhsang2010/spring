package movie;

import java.util.List;

import core.Movie;

public abstract class MovieFinder {
	String fileName;
	
	public MovieFinder() {
		this.fileName = null;
	}

	public abstract List<Movie> all();
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
		}
}
