import java.util.Scanner;
import java.lang.Math;

public class InterestEarned 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        //

        System.out.println("What is the Principal?");
        double Principal = keyboard.nextDouble();

        System.out.println("\nWhat is the interest rate?");
        double interestRate = keyboard.nextDouble();
        double ratePercent = interestRate*100;

        System.out.println("\nHow many times has the interest been compounded?");
        int timesCompund = keyboard.nextInt();

        double Amount = Principal * Math.pow(1+interestRate/timesCompund, timesCompund);
        double Interest = Amount - Principal;

        System.out.printf("\nInterest Rate: %.2f%%", ratePercent);
        System.out.printf("\nTimes Compunded: %d", timesCompund);
        System.out.printf("\nPrincipal: $%.2f", Principal);
        System.out.printf("\nInterest: $%.2f", Interest);
        System.out.printf("\nAmount in Savings: $%.2f", Amount);

        keyboard.close();
    }
    
}
