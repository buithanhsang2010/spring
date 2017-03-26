package movie;

import java.util.List;

import core.Movie;

public abstract class MovieFinder {
	protected String fileName;
	
	public MovieFinder(String fileName) {
		this.fileName = fileName;
	}
	
	public abstract List<Movie> all();
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
