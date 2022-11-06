import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Print "Hello world" 10 times

      //  for(int i = 0;i<10;i++){
       //     System.out.println("Hello world");

     //   }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any positive number");

        //if our number is 5 ,then print 5 4 3 2 1 0

        int input = scanner.nextInt();

        for(int i = input;i>=0;i--){
            System.out.println("show nums : " + i);
        }


    }
}
