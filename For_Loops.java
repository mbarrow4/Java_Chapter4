/**Program that takes a user's number and counts down */
//Imports
import java.util.*;

public class For_Loops //Class Declarations
{
	public static void main(String[] args) //main method begins execution of program
	{
	/**User Input*/
		Scanner input = new Scanner(System.in);
		System.out.println("Type in a number less that 10");
		
		
		/**FOR LOOP-BLOCK*/
	
		for(int number = input.nextInt(); number<=10; number++)
		{
			System.out.println(number);//printf METHOD
		}//end of for loop
		
	}//end of main
	

}//end of class
