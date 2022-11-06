package collections;

import java.util.ArrayList;

public class ListInterfaceExample {
    public static void main(String[] args) {

        //Declaring ArrayList

        ArrayList<String> car = new ArrayList<>();

        //how to add elements

        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");


        //how to print them all out
        System.out.println(car);
        //Get element by index
        System.out.println(car.get(0));
        //Add element at specific index
        car.add(2,"Ford");
        System.out.println(car);
        //change one of the element values
        car.set(3,"TOyoTA");
        System.out.println(car);
        //remove element
        car.remove(5);
        System.out.println(car);
        //size
        System.out.println(car.size());
        //delete all elements
        car.clear();
        System.out.println(car);
    }
}
