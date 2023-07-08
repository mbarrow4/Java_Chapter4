/**Program that only counts then gets the sum of odd numbers*/
public class Adding_Odd_Numbers 
{

	public static void main(String[] args) 
	{
		int sum=0;
		for(int count=0; count <=99; count++)
		{
			if (count %2 ==1)
			{
				sum=sum +count;
				
			}//End of If Statement
		
		}//End of For Loop
		/**OUTPUT*******************/
		System.out.println(sum);

	}//End of Main

}//End of Class
