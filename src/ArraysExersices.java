import java.util.Scanner;
import java.util.Arrays;

public class ArraysExersices {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter array size: ");

        int arraySize = scanner.nextInt();

        //Declare empty array in given size

        int[] storageArray = new int[arraySize];

        System.out.println("Please Enter array elements one by one");


        for (int i = 0; i < arraySize; i++) {

            System.out.println("Please enter element :" + (i + 1));
            storageArray[i] = scanner.nextInt();
            sum += storageArray[i];

        }
        System.out.println(Arrays.toString(storageArray));
        System.out.println("summ of all elements is : " + sum);


    }
}
