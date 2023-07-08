/**A program that prints the 12 days of Christmas*/

//IMPORT
import java.util.*;

public class Twelve_Days_of_Christmas 
{
	
	public static void main(String[] args) 
	{
		//INPUT
		Scanner input = new Scanner(System.in);
		System.out.println("Type a number from 1 to 12: ");
		
		while(input.hasNext())
		{
		int day= input.nextInt();
		
		switch(day) 
		{
		case 12:
			System.out.println("twelve drummers drumming");
		
		case 11:
			System.out.println("eleven pipers piping");
			
		case 10:
			System.out.println("ten lords a-leaping");
			
		case 9:
			System.out.print("nine ladies dancing");
			
		case 8:
			System.out.println("eight maids a-milking");
			
		case 7:
			System.out.println("seven swans a-swimming");
	
		case 6:
			System.out.println("six geese a-laying");
			
		case 5:
			System.out.println("FIVE GOLDEN RINGS");
			
		case 4:
			System.out.println("Four calling");
	
		case 3:
			System.out.println("Three French hens");
	
		case 2:
			System.out.println("Two turtle doves");
			
		default:
			System.out.println("A partrige in a pear tree");
			break;
			
		}//End of Switch
		}
	}//End of MAIN

}//End of CLASS
