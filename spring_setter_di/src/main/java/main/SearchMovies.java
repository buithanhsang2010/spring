package main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import movie.MovieLister;

public class SearchMovies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:services.xml");
	    MovieLister movieLister = ctx.getBean(MovieLister.class);
	    System.out.println(movieLister.moviesDirectedBy());
	    ((ClassPathXmlApplicationContext) ctx).close();
	}

}
