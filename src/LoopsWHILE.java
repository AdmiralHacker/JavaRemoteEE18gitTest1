import java.util.Scanner;

public class LoopsWHILE {
    public static void main(String[] args) {

        //print hello world 10 times

      //  int i = 0;
      //  while (i<10){
      //      System.out.println("Hello World");
       //     i++;
      //  }
        Scanner scanner= new Scanner(System.in);
        char runAgain = 'y';

        while(runAgain =='y'){
            int input = scanner.nextInt();

            if(input<=0){
                for(int i = 0;i>input;i--){
                    System.out.println(i + "  ");

                }

            }else{
                for(int i = 0;i<=input;i++){
                    System.out.println(i + "  ");
                }
            }

            System.out.println("Do you want to run again ? (y/n)");
            runAgain= scanner.next().charAt(0);
            System.out.println("Thank u ");
        }




    }
}
