package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetInterfacesExample {
    public static void main(String[] args) {

        //HashSet

        HashSet<String> names = new HashSet<>();
        //add elements
        names.add("Bob");
        names.add("Anna");
        names.add("Liam");
        //print out

        System.out.println(names);

        //remove element
        names.remove("Bob");
        System.out.println(names);

        //size
        System.out.println(names.size());

        //Contains dlja poiska elementa True/False
        System.out.println(names.contains("Liam"));
        System.out.println(names.contains("Bob"));

        //Iterate
        for (String str : names) {
            System.out.println(str);

        }

        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        //Example 2

        HashSet<Integer> intSet1 = new HashSet<>();
        intSet1.add(1);
        intSet1.add(2);
        intSet1.add(3);
        intSet1.add(4);
        System.out.println("intSet1 : " + intSet1);


        HashSet<Integer> intSet2 = new HashSet<>();
        intSet2.add(3);
        intSet2.add(4);
        intSet2.add(5);
        intSet2.add(6);
        System.out.println("intSet2 : " + intSet2);

        //Finding union

        HashSet<Integer> union = new HashSet<>(intSet1);
        System.out.println("union before: " + union);
        union.addAll(intSet2);
        System.out.println("union after: " + union);
        //Finding intersection

        HashSet<Integer> intersection = new HashSet<>(intSet1);
        intersection.retainAll(intSet2);

        System.out.println("Intersection : " + intersection);


        //finding diference for intSet1

        HashSet<Integer> difference = new HashSet<>(intSet1);
        difference.removeAll(intSet2);
        System.out.println("difference:" + difference);

        //LinkedHashSet

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Estonia");
        linkedHashSet.add("Latvia");
        linkedHashSet.add("Italy");
        linkedHashSet.add("Sweden");

        System.out.println(linkedHashSet);
        linkedHashSet.remove("Latvia");
        System.out.println(linkedHashSet);


    }


}
