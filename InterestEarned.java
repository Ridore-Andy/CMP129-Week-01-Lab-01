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

        System.out.println("\nHow many times has the interest been compounded?");
        int timesCompund = keyboard.nextInt();

        double Amount = Principal * Math.pow(1+interestRate/timesCompund, timesCompund);
        System.out.println(Amount);

        keyboard.close();
    }
    
}
