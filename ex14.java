/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program computes the tax on an order amount
import java.util.Scanner;
public class ex14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
            double subtotal = input.nextDouble();

        System.out.print("What is the state? ");
            String state = input.next();

        double tax;
        if(state.equalsIgnoreCase("WI")){
            //prints subtotal
            System.out.printf("The subtotal is $%.2f\n", subtotal);

            tax = 5.5/10;
            System.out.printf("The tax is $%.2f\n", tax);
        }//end of if
        else {
            tax = 0;
        }//end of else

        //calculates total
        double total = subtotal + tax;

        //prints actual total
        System.out.printf("The total is $%.2f\n", total);

    }//end of main
}//end of class