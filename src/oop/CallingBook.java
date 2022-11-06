package oop;

public class CallingBook {

    public static void main(String[] args) {
        // Create book class object

        Book book1 = new Book();


        //Setting field values

        book1.title = "Test";
        book1.author= "Test Author";
        book1.setNumberOfPages(150);

        book1.printBookInfo();

        //creating a new instance of a book class
        Book book2 = new Book();
        book2.title = "Test23123";
        book2.author= "Test Author3123123";
        book2.setNumberOfPages(170);



        book2.printBookInfo();




    }


}
