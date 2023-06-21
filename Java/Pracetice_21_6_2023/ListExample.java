package Pracetice_21_6_2023;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args){
        // Create a List of strings
        List<String> fruits = new ArrayList<>();

        // Add elements to the List
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Get the size of the list
        int size = fruits.size();
        System.out.println("Size of the list: "+size);

        // Access elements in the list
        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: "+ firstFruit);

        // Modify elements in the list
        fruits.set(1, "Mango");
        System.out.println("Modified List: "+ fruits);

        // Iterate over the elements in the list
        System.out.println("Elements in the list: ");
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        // Remove an element from the list
        boolean remove = fruits.remove("Orange");
        System.out.println("Is 'Orange' remove? "+ remove);
        System.out.println("Update list: "+fruits);
        
        // Check if the list contains a specific element
        boolean contains = fruits.contains("Banana");
        System.out.println("Does the list contain 'Banana'? "+ contains);

        // Clear all elements from the list
        fruits.clear();

        System.out.println("Size of the list after clearing: "+ fruits.size());
    }
}
