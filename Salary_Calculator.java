/**A program that determines the gross pay for each of three employees*/

//IMPORTS
import java.util.Scanner;

public class Salary_Calculator 
{

	public static void main(String[] args) 
	{
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Declarations
		double overtime_Emp1=0;
		double overtime_Emp2=0;
		double overtime_Emp3=0;
		
		
		
		/**EMPLOYEE*ONE***************************************************/
		//PAY
		System.out.println("How much MONEY does Employee 1 make each hour? ");
		double employee1_pay = input.nextDouble();
		//HOURS
		System.out.println("How man HOURS did Employee 1 work this week? ");
		double employee1_hours = input.nextDouble();
		
		/**EMPLOYEE*TW0***************************************************/
		//PAY
		System.out.println("How much does Employee 2 make each hour? ");
		double employee2_pay = input.nextDouble();
		//HOURS
		System.out.println("How man HOURS did Employee 1 work this week? ");
		double employee2_hours = input.nextDouble();
		
		/**EMPLOYEE*THREE***************************************************/
		System.out.println("How much does Employee 3 make each hour? ");
		double employee3_pay = input.nextDouble();
		System.out.println("How man HOURS did Employee 1 work this week? ");
		double employee3_hours = input.nextDouble();
		
		/**CALCULATIONS******************************/
		if(employee1_hours>40) 
		{
			overtime_Emp1= employee1_hours-40;
		}
		if(employee2_hours>40) 
		{
			overtime_Emp2= employee2_hours-40;
		}
		if(employee3_hours>40) 
		{
			overtime_Emp3= employee3_hours-40;
		}
		double employee1_gross=(employee1_pay*employee1_hours)+ (overtime_Emp1*(employee1_pay+(employee1_pay/2)));
		double employee2_gross=(employee2_pay*employee2_hours)+(overtime_Emp2*(employee2_pay+(employee2_pay/2)));
		double employee3_gross=(employee3_pay*employee3_hours)+(overtime_Emp3*(employee3_pay+(employee3_pay/2)));
		
		System.out.printf("Employee 1's gross pay is: %.2f\n",employee1_gross);
		System.out.printf("Employee 2's gross pay is: %.2f\n",employee2_gross);
		System.out.printf("Employee 3's gross pay is: %.2f\n",employee3_gross);


	}//End of MAIN

}//End of CLASS
