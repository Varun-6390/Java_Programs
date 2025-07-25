        // ArrayList = A resizeable array that stores objects (autoboxing)
        // Arrays are fixed in size, but ArrayLists can change

import java.util.ArrayList;
import java.util.Collections;

public class Program_56 {
      public static void main(String[] args) {


        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        Collections.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
