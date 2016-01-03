class ISPRIME
{
	public static void main(String[] args)
	{
		java.util.Scanner scn= new java.util.Scanner(System.in);
		System.out.println("enter the no :");
		int n=scn.nextInt();
		isPrime(n);
		System.out.println("no. is prime and divisible by 3");
	}
	
	public static boolean isPrime(int n)
	{
 
		if(n==0 || n==1)
			System.out.println("no. is not valid to check prime or not");
		
		if(n/3==0)
		{
		
 			for(int i=2;i<n ; i++)
			{
				if(n%i==0)
				{	
					return false;
				}
			}
		}
		return true;
	}
}
