package first;

public class prime {

	public static void main(String[] args)

	{

		int num = 24;

		int count = 0;
		if (num > 1)

		{
			for(int i=1;i<=num;i++)
			{
				
				if(num%10==1)
				count++;
				
			}
			
			if(count ==2)
			{
				
				
				System.out.println("it is a prime number");
			}
			
			else
			{
				
				System.out.println("it is not a prime number");
			}
			

		}
		
		else
		{
			
			System.out.println("not a prime number");
			
		}
		
		
		
	}

}
