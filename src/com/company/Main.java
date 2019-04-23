package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> movieList = new ArrayList<String>();
        String movie = "";

        System.out.println("What is your favorite movies?");

        while (! "q".equalsIgnoreCase(movie)) {

            System.out.print("Movie or (q) to Quit: ");

            movie = scanner.nextLine();
            movieList.add(movie);
            movieList.remove("q");
            movieList.remove("Q");
        }


        System.out.println("\nList of Movies:");
        //Prints list of movies
        for (String m:movieList){
            System.out.println(" " + m);
        }

        //Prints out sorted list of movies
        System.out.println("\nSorted list of Movies");
        Collections.sort(movieList);
        for (String m:movieList){
            System.out.println(" " + m);
        }

        //Shuffles and takes one movie to print
        System.out.print("\nYou should watch: ");
        Collections.shuffle(movieList);
//        System.out.println(movieList);
        System.out.println(movieList.get(2));

    }
}
