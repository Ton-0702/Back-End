package Pracetice_21_6_2023;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        List<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: "+size);

        // Access elements in the ArrayList
        int firstNumber = numbers.get(0);
        System.out.println("First number: "+firstNumber);

        // Modify elements in the ArrayLisst
        numbers.set(1,25);
        System.out.println("Modified ArrayList: "+numbers);

        // Iterate over the elements in the ArrayLisst
        System.out.println("Elements in the ArrayList: ");
        for (int number : numbers){
            System.out.println(number);
        }

        // Remove an element from the ArrayList
        boolean removed = numbers.remove(Integer.valueOf(30));
        System.out.println("Is 30 removed? "+ removed);
        System.out.println("Updated ArrayList: "+numbers);

        // check if the arraylist contains a specific element
        boolean contains = numbers.contains(20);
        System.out.println("Does the ArrayList contain 20? "+contains);

        // Clear all elements from the ArrayList
        numbers.clear();
        System.out.println("Size of the ArrayLisst after clearing: "+numbers.size());
    }
}
