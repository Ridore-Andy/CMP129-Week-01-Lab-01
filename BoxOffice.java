import java.util.Scanner;

public class BoxOffice 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        final double adultTicket = 10.00;
        final double childTicket = 6.00;
        final double netPercent = 0.20;

        //System.out.println(adultTicket);
        //System.out.println(childTicket);

        System.out.println("What is the name of the movie?");
        String movieName = keyboard.nextLine();
        System.out.println("\nHow many adult tickets were sold?");
        int adultSold = keyboard.nextInt();
        System.out.println("\nHow many child tickets were sold?");
        int childSold = keyboard.nextInt();

        double grossProfit = adultTicket * adultSold + childTicket * childSold;
        double netProfit = grossProfit * netPercent;
        double distributePaid = grossProfit - netProfit;


        System.out.println("Movie Name: "+movieName);
        System.out.println("Adult Tickets sold: "+adultSold);
        System.out.println("Child Tickets sold: "+childSold);
        System.out.printf("Gross Box Office Profit: $%.2f",grossProfit);
        System.out.printf("\nNet Box Office Profit: $%.2f",netProfit);
        System.out.printf("\nAmount Paid to Distributor: $%.2f",distributePaid);

        keyboard.close();
    }
    
}
