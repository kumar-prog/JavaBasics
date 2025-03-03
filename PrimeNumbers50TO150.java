import java.util.Scanner;

public class PrimeNumbers50TO150 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter Starting Number");
		 int startingNumber= sc.nextInt();
		 
		 System.out.println("Enter Ending Number");
		 int endingNumber=sc.nextInt();
		
		for(int n=startingNumber;n<=endingNumber; n++)
		{
			int numberOfDividends=0;
					
				for(int i=1;i<=n;i++) 
					{ 
						if(n%i==0)
						 {
							numberOfDividends++;
						 }
					}	
					if(numberOfDividends<=2) 
						 {
							 System.out.println(n);
						 }
			
		}
		
		
	} 
		 

	

}
