package homework.home2;

public class Vehicle {
//ispolzovat protected kogda mi hotim sozdat SubClass osnovnomu klassu
    //ostolnoe ispolzovat nuzno private
    protected float fuel;
    protected float fuelUsage;
    protected int passengers;


    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;


    }
//pervij metod mozno skopirovat i budet rabotat v drugih proektah
    //potomu 4to sozdan polnij konstruktor
    public float maxDistance(float fuel, float fuelUsage, int passengers) {

        return fuel / (fuelUsage * (1 + passengers * 0.05f)) * 100;

    }
//etot metod nelzja skopirovat  v drugoj proekt tak kak ne sozdan konstruktor
    public float maxDistance() {
        return fuel / (fuelUsage * (1 + passengers * 0.05f)) * 100;

    }

}
