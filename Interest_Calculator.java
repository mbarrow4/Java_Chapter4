/**A simple program that calculates the interest of a loan from 1-5 years*/

//Imports
import java.util.Scanner;

public class Interest_Calculator 
{
	public static void main(String[] args) 
	{
		//INPUT
		Scanner input = new Scanner(System.in);
		System.out.println("How many years is your loan?: ");
		
		//Constants are placed OUTSIDE the loop
		int one=1;
		int principal=1000;
		double rate= 0.05; 
		
		//Display Headers
		System.out.printf("%s%20s%n", "Year", "Amount of Deposit");
		for(int year= input.nextInt(); year<=10; year++) 
		{	
			double amount= principal *(one +rate);
			System.out.printf("%4d%,20.2f%n", year, amount);
		
		}//END FOR

	}//End of MAIN

}//End of CLASS
