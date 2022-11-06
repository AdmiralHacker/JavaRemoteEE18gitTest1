public class Arrays {
    public static void main(String[] args) {


        //declare array that will store 3 elements of type String

        String[] names = new String[3];


        //setting element values using each element's index

        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";

        //getting values from array

        System.out.println(names[2]);


        //Lenght of a array

        System.out.println(names.length);

        //Second way declare and initialize array

        String[] dreamCars = new String[]{"Mercedes","BMW","Tesla","Ferrari"};

       // System.out.println(dreamCars[0]);
       // System.out.println(dreamCars[1]);
       // System.out.println(dreamCars[2]);   //DRY - DONT REPEAT YOURSELF
       // System.out.println(dreamCars[3]);

        for(int i = 0;i< dreamCars.length;i++){
            System.out.println(dreamCars[i]);
        }




    }
}
