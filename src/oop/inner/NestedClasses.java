package oop.inner;


import java.util.Enumeration;

class OuterClass {
    int num = 10;


    class InnerClass {
        int num = 5;
    }
}


public class NestedClasses {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        System.out.println("OuterClass value: " + outerClass.num);
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("InnerCLass value: "+ innerClass.num);

    }


}
