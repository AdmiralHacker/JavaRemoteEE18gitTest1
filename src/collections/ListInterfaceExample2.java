package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {

        //Example 1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List 1: " + list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List 2: " + list2);


        //Example 2
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test 1");
        arrayList.add("Test 2");
        arrayList.add("Test 3");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();


        for (String str : arrayList) {
            System.out.print(str + " ");
        }
        System.out.println();


        //LinkedList

        LinkedList<String> car = new LinkedList<>();
        car.add("volvo");
        car.add("opel");
        car.add("toyota");
        System.out.println(car);
        //Get last/first element
        System.out.println(car.size() - 1);
        System.out.println(car.getLast());
        System.out.println(car.getFirst());


        LinkedList<Integer> numsList = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            numsList.add(i);

        }
        System.out.println(numsList);


    }

}
