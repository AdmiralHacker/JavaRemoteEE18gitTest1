package homework.geometery;

public class Rectangular {
    protected float length;
    protected float width;

    public void  area(){
        System.out.println("Area is "+length*width);

    }
    public void perimeter(){
        System.out.println("Perimeter is "+  2*(width+length));
    }
    public  Rectangular(float width,float length){
        this.length=length;
        this.width=width;

    }

}
