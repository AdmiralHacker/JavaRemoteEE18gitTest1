package patterns.structural.bridge;

public class Pentagon extends Shape  {

    public Pentagon(Color c){
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.println("Pentagon is filled with a color: ");
        color.applyColor();
    }
}
