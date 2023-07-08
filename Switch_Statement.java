/**Simple program that obtains a grade based on user input*/

//Imports
import java.util.Scanner;

public class Switch_Statement //Class Declarations
{

	public static void main(String[] args) //main method begins execution of program
	{
		/**INPUT BLOCK*****************************************/
		//Input
		Scanner input = new Scanner(System.in);
		//Prompt 
		System.out.print("Please enter a percentage: ");
		//Declaration of variable
		int num = input.nextInt();
		
		int grade=num/10;
		/**SWITCH*STATEMENT*****************************************/
		switch(grade) 
		{
		case 10:
			System.out.print('A');
			break;
		case 9:
			System.out.print('A');
			break;
		case 8:
			System.out.print('B');
			break;
		case 7:
			System.out.print('C');
			break;
		case 6:
			System.out.print('D');
			break;
		default:
			System.out.print('F');
			break;
			
		}//End of Switch

	}//End of main 

}//End of class
