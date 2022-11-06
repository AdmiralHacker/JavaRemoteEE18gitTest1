package oop;

public class CalingBird {
    public static void main(String[] args) {
        //Creating an object

        Bird gulka = new Bird();

        //Set fields values

        //  gulka.name = "zasranka";
        //  gulka.color = "White"  ;
        //  gulka.avgLifespan= 15.7d;

        //Get field values

        //  System.out.println(gulka.name);
        //  System.out.println(gulka.color);
        //  System.out.println(gulka.avgLifespan);

        //Get bird's int ousing printBirdInfo method

        gulka.setName("Gulka");
        gulka.setColor("Blue");
        gulka.setAvgLifespan(25.3d);

        //Getting values using getter methods

        System.out.println(gulka.getName());
        System.out.println(gulka.getColor());
        System.out.println(gulka.getAvgLifespan());

        gulka.printBirdInfo();


    }


}
