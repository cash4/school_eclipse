package recursion;


public class Recursive_driver {

	/**
	 * @param args
	 */
	
	
	public static int Power_nr(int x, int n)
	{
		int result = 1;
		for (int i=0; i<=n-1; i++)
			result *= x;
		return result;
		
		
	}
	
	public static int Power(int x, int n)
	{
		if (n==0)  			// base case
			return 1;
		else				// general case
			return x * Power(x, n-1);
		
	}
	
	public static int Factorial_nr (int n)
	{
		int result = 1;
		for (int i=n;i>0;i--)
			result *= i;
		return result;
	}
	
	public static int Factorial(int n)
	{
		//base case:
		if (n==0)
			return 1;
		else   //general case
			return n * Factorial (n-1);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		
		int x = 2;
		int n = 3;
		System.out.println("power nr " + Power_nr(x,n));
		if (n>=1)
		   System.out.println("power " + Power(x,n));
		else 
		{
			int result = Power(x,0-n);
			System.out.println("power " + 1.0/result);
		}
		
		System.out.println("factorial of n is "+ Factorial_nr(n));
		System.out.println("factorial of n is "+ Factorial(n));
		

	}

}
