package movidelister;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

import core.Movie;
import movie.CommaMovieFinder;
import movie.MovieFinder;

public class TestCommaMovieFinder {

	@Test
	public void test() throws IOException {
		// Preparing the movie file
		String fileName = "/tmp/comma_movies.text";
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		bw.write("how to train dragon, 500 days of summer, forest gump");
		bw.flush();
		bw.close();
		
		MovieFinder movieFinder = new CommaMovieFinder(fileName);
		List<Movie> movies = movieFinder.all();
	    assertTrue(movies.get(0).getName().equals("how to train dragon"));
	    assertTrue(movies.get(1).getName().equals("500 days of summer"));
	    assertTrue(movies.get(2).getName().equals("forest gump"));
	}

}
