package oop;

public class Animal {

    //Fields
   private String type ;
   private int avgLifespan;
   private double weight;



    //Methods
    //Constructor (its like a speacial method)

    public Animal(String type,int avgLifespan,double weight){
        this.type = type;
        this.avgLifespan = avgLifespan;
        this.weight = weight;

    }

    public Animal(String type, int avgLifespan){
        this.type = type;
        this.avgLifespan=avgLifespan;

    }

    public Animal(){

    }


    public void printAnimalInfo(){
        System.out.println("Type : "+ type);
        System.out.println("Average Lifespan: "+ avgLifespan);
        System.out.println("Weight: "+ weight);

    }
}
