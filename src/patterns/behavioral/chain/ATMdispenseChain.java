package patterns.behavioral.chain;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATMdispenseChain {

    private DispenseChain c1;

    public static void main(String[] args) {
        ATMdispenseChain atMdispenseChain = new ATMdispenseChain();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;

            }
            atMdispenseChain.c1.dispense(new Currency(amount));
        }
    }

    public ATMdispenseChain() {
        //initializing the chain
        c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        //set chain of responsibility

        c1.setNextChain(c2);
        c2.setNextChain(c3);


    }


}
