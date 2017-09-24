package example12;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display will show the Stock Commission.
*/
public class Example12 
{ 
    public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
	    double costPerStock;
		double numberOfStocks;
		double percentageOfCommission;
		double stocksCost;
		double commissionCost;
		double total;
		
		// Prompt the user for the cost per stock and store the value
		System.out.print("Enter the cost per stock: ");
		costPerStock = in.nextDouble();
		
		// Prompt the user for the number of stocks purchased and store the value 
        System.out.print("Enter the number of stocks purchased: ");
		numberOfStocks = in.nextDouble();
		
		// Prompt the user for the percentage of the commission and store the value
		System.out.print("Enter the percentage (as a decimal) of the commission: ");
		percentageOfCommission = in.nextDouble();
		
		// Calculation
		stocksCost = costPerStock * numberOfStocks;
		commissionCost = stocksCost * percentageOfCommission;
		total = stocksCost + commissionCost;
		
		// Display the cost of purchasing all of the stocks:
		System.out.println("Cost for Stocks: " + "$" + stocksCost);
		
		// Display the cost of the commission
		System.out.println("Cost for Commission: " + "$" + commissionCost);
		
		// Display the total cost spent
		System.out.println("Total Cost: " + "$" + total);
	} 
}
