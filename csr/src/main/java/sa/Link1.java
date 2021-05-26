package sa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Link1 {
    private String name;
    Link1(String name){

    }
     int count=0;

     public static void main(String[] args) {

       String [] arr = new String[] {"aa","lo"};
         List<String> list = Arrays.asList(arr);
         list.forEach(System.out::println);
         Collections.sort(list);
         System.out.println(Arrays.toString(arr));
     }
    Object message() {
        System.out.println("Hello");
        return "Hello";
    }

  /* *//* public static void main(String[] args) {

        System.out.println(new Link1().message());
        System.out.println(new Link2().message());
    }
}*//*
   public static void main(String[] args) {
       Lin1
   }*/
}
