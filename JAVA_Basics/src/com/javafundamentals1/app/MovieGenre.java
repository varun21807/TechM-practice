package com.javafundamentals1.app;

import java.util.*;


public class MovieGenre {


public static void main(String[] args) {

String[] movieNames =  {
"The Matrix", "Inception",
"Avengers: Endgame", "The Dark Knight",
"Titanic", "The Lion King",
"Home Alone", "The Pursuit of Happyness",
"Tenali Raman", "Moana2"
  };  

String[] movieGenres = {
"SCI-FI", "SCI-FI",
"ACTION", "ACTION",
"ROMANCE", "ANIMATION",
"COMEDY", "DRAMA",
"COMEDY", "COMEDY"
};

System.out.println("AVAILABE MOVIE GENRE");
System.out.println("---------------------");
System.out.println("SCI-FI");
System.out.println("ACTION");
System.out.println("DRAMA");
System.out.println("ANIMATION");
System.out.println("COMEDY");

Scanner search = new Scanner(System.in);

System.out.println("Search The Movie Genre : ");
String genre = search.nextLine().toUpperCase();

if (genre.equals("SCI-FI") || genre.equals("ACTION") || genre.equals("DRAMA") || genre.equals("ANIMATION") || genre.equals("COMEDY") || genre.equals("ADVENTURE"))
{

  for (int i=0;i<movieGenres.length;i++) {

     if (genre.equals(movieGenres[i])) {
        System.out.println(movieNames[i]);
   }

 }
}

else {
System.out.println("Movie Is Not Found In This Genre : " + genre);
}

search.close();
}

}

