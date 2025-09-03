package com.xworkz.theaterapp;

import com.xworkz.theaterapp.movie.Movie;
import com.xworkz.theaterapp.theater.Theather;

public class TheaterRunner {
    public static void main(String[] args) {
        Movie movie1 = new Movie(1, "Coolie", "Rajinikanth", "2:15:35", "A");
        Movie movie2 = new Movie(2, "Baahubali: The Beginning", "Prabhas", "2:39:00", "U/A");
        Movie movie3 = new Movie(3, "RRR", "N.T.R.", "3:00:00", "U/A");
        Movie movie4 = new Movie(4, "KGF Chapter 1", "Yash", "2:55:00", "U/A");
        Movie movie5 = new Movie(5, "Sarkar", "Vijay", "2:50:00", "U/A");
        Movie movie6 = new Movie(6, "Master", "Vijay", "2:48:00", "U/A");
        Movie movie7 = new Movie(7, "Robot", "Rajinikanth", "2:30:00", "U");
        Movie movie8 = new Movie(8, "Pushpa", "Allu Arjun", "2:34:00", "U/A");
        Movie movie9 = new Movie(9, "Drishyam", "Mohanlal", "2:42:00", "U/A");
        Movie movie10 = new Movie(10, "Vikram", "Kamal Haasan", "2:58:00", "A");


        Theather theather = new Theather();
        if(theather.addMovie(movie1)&&theather.addMovie(movie2)&&theather.addMovie(movie3)&&
                theather.addMovie(movie4)&&theather.addMovie(movie5)&&theather.addMovie(movie6)&&
                theather.addMovie(movie7)&&theather.addMovie(movie8)&&theather.addMovie(movie9)&&
                theather.addMovie(movie10)){
            theather.getmovieInfo();
        }


    }
}
