package oopEnum.inheritance;


class Vehicle{
    protected String brand;

    public void honk(){
        System.out.println("Tutu");
        System.out.println("My Brand is :"+ brand);
    }
}


class Bike extends Vehicle{
    public void honk(){
        System.out.println("BipBip");
        System.out.println("My Brand is :"+ brand);
    }

}


public class VehicleExamples {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Tesla";
        vehicle.honk();


        Bike bike = new Bike();
        bike.brand = "Cube";
        bike.honk();

    }
}
