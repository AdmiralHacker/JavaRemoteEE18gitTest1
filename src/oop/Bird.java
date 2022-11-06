package oop;

import com.sun.source.tree.UsesTree;

public class Bird {

    //Fields
    private String name;
    private String color;
    private double avgLifespan;

    //methods

    //setters methods
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAvgLifespan(double avgLifespan) {
        this.avgLifespan = avgLifespan;
    }
    //getters methods

    public String getName() {
        return name;

    }

    public String getColor() {
        return color;
    }

    public double getAvgLifespan() {
        return avgLifespan;
    }

    public void printBirdInfo() {
        System.out.println("Bird info : ");
        System.out.println("Name - " + name);
        System.out.println("Color - " + color);
        System.out.println("Acerage lifspan - " + avgLifespan);

    }

}
