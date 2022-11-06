package oopEnum.inheritance.interfaces;


interface Bug{
    public void bugSound();
    public void bugSize();

}
interface Location{
    public void location();

}



//interface we implements and abstract we extends
class Ant implements Bug,Location{
    public void bugSound(){
        System.out.println("Tsss");
    }

    public void bugSize(){
        System.out.println("Small");
    }
    public void location(){
        System.out.println("Forest");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSize();
        ant.bugSound();
        ant.location();

    }
}
