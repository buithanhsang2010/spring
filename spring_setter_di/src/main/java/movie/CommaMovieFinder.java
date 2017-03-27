package movie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import core.Movie;

public class CommaMovieFinder extends MovieFinder {

	private static BufferedReader inputFile = null;
	public CommaMovieFinder() {
		this.fileName = null;
	}
	
	public CommaMovieFinder(String fileName) {
		this.fileName = fileName;
	}
	
	public List<Movie> all(){
		if(inputFile == null) {
			try {
				inputFile = new BufferedReader(new FileReader(this.fileName));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return null;
			}
		}
		// TODO Auto-generated method stub
		List<Movie> movies = new ArrayList<Movie>();
		String line;
		try {
			String[] movieNames;
			String movieName;
			while((line = inputFile.readLine()) != null) {
				movieNames = line.split(",");
				for(int i=0; i < movieNames.length; i++) {
					movieName = movieNames[i].trim();
					movies.add(new Movie(movieName));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return movies;
	}

}
