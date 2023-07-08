/**A simple program that outputs the sum of factorial from the number 10*/
public class Factorial {

	public static void main(String[] args) 
	{
		int factorial=0;
		for(int num=0; num <=10; num++)
		{
		factorial= num *(num-1);	
		
		}//End of FOR
		System.out.println(factorial);
	}//End of MAIN

}//End of CLASS
