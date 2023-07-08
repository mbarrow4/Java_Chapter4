/**Letter Grade class uses a switch statement to count the number of letter grades*/
//Import
import java.util.Scanner;

public class Letter_Grade 
{
	

	public static void main(String[] args) 
	{
		//Initialization of grades
		int a =0;
		int b=0;
		int c=0;
		int d=0;
		int f=0;
		int total=0;
		int grade_count=0;
		
		/***INPUT BLOCK *************************************************************/
		Scanner input = new Scanner(System.in);
		System.out.println("Please type your grade: ");
		
		/***WHILE*LOOP********************************************************************/
		while(input.hasNext())//"has.next"-determines if there is anymore input
		{
			int grade= input.nextInt();
			total=total+grade;
			grade_count++;
			
		/**SWITCH*STATMENT*********************************************************************/
			switch(grade/10) 
			{
			case 10:
				System.out.println('A');
				a++;
				break;
			case 9:
				System.out.println('A');
				a++;
				break;
			case 8:
				System.out.println('B');
				b++;
				break;
			case 7:
				System.out.println('C');
				c++;
				break;
			case 6:
				System.out.println('D');
				d++;
				break;
			default:
				System.out.println('F');
				f++;
				break;
			}//End of switch statement
			
		}//End of While Loop
		
		//Display grade report
		System.out.println("GRADE REPORT");
		
		//if user entered at least one grade
		if(grade_count !=0)
		{
			double average= (double)total/grade_count;
		}//End of if statement
		
		System.out.printf("Total of %d grades entered is %d%n",grade_count,total);
	}//End of Main Method

}//End of Letter_Grade Class
