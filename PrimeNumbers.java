

public class PrimeNumbers {

	public static void main(String[] args)
	{
		int i,j;
		boolean flag;
		for(i=1; i<=100; i++)
		{
			flag = true;
		
			for(j=2; j<=Math.sqrt(i); j++)
			{	
				if (i%j == 0)
						{
							flag = false;
							break;
						}
				
			}
			if (flag == true && i > 1)
					System.out.println(i);
		
		}
			
	}
}
