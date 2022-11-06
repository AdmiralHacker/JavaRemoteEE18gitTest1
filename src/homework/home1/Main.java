package homework.home1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter floor sie");
        System.out.println("Enter floor lenght");
        double length=scanner.nextDouble();

        System.out.println("Enter floor width");
        double width = scanner.nextDouble();

        //Create Floor Class object

        Floor floor = new Floor(width,length);

        System.out.println("Enter Carpet price per m^2");

        double cost = scanner.nextDouble();

        //Create carpet class object

        Carpet carpet = new Carpet(cost);
        //Create Calculator object and pass
        //Floor and Carpet objects as input parameters
        Calculator calculator =new Calculator(floor,carpet);
        System.out.println("asnwer is "+ calculator.getTotalCost());

    }
}
