import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any numbers :");

        int input = scanner.nextInt();

        if(input>=0){
            for(int i=input;i>=0;i--){
                System.out.println(i);
            }
        }
        else{
            for(int i =input;i<=0;i++) {
                System.out.println(""+i);
            }
        }



    }
}
