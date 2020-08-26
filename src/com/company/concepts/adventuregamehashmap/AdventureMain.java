package com.company.concepts.adventuregamehashmap;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Scanner;

public class AdventureMain {
    private static HashMap<Integer, Location> Location = new HashMap<Integer, Location>();

    public static void main(String[] args ){
      Scanner input = new Scanner(System.in) ;

      Location.put(0, new Location(0, "value one"));
      Location.put(1, new Location(1, "value 2"));
      Location.put(2, new Location(2, "value 3"));
      Location.put(3, new Location(3, "value 4"));

      int loc = 1;
      while(true){
          System.out.println(Location.get(loc).getDescription() );
          if(loc == 0){
             break;
          }
          loc  = input.nextInt();
          if(!Location.containsKey(loc)){
              System.out.println("Not find");
          }
      }

  }
}
