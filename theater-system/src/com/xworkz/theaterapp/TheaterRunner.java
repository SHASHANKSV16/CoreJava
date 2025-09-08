package com.xworkz.theaterapp;

import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.theater.Theather;

import java.util.Scanner;

public class TheaterRunner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of movies to be add");
        int size = scanner.nextInt();
        Theather theather= new Theather(size);
        System.out.println("Theater Available are :"+theather.movies.length);

        for (int index=0; index<size ; index++){

            Movie movie = new Movie();

            System.out.println("Enter  id :");
            movie.setMovieId(scanner.nextInt());

            System.out.println("Enter movie name :");
            movie.setMovieName(scanner.next());

            System.out.println("Enter hero Name :");
            movie.setHero(scanner.next());

            System.out.println("Duration :");
            movie.setDuration(scanner.next());

            System.out.println("Certification :");
            movie.setCertification(scanner.next());

            theather.addmovie(movie);
        }
        theather.getmovieInfo();

    }
}
