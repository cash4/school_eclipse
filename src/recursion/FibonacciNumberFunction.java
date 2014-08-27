/**
 * 
 */
package recursion;

/**
 * @author Corey
 *
 */
public class FibonacciNumberFunction {

	/**
	 * @param args
	 */
	
	static int Fib(int n) // actually slower than non-recursive
	{
		if (n==0) //base case 1
			return 0;
		else if (n==1)//base case 2
			return 1;
		else
			return Fib(n-1) + Fib(n-2); //Recursive call
	}
	
	public static int Fib_nr(int n)
	{
		int base0 = 0, base1=1;
		int result = 0;
		
		for (int i=2;i<=n;i++)
		{
			result = base0 + base1;
			base0 = base1;
			base1 = result;
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 49;
		System.out.println(Fib(month));
		System.out.println(Fib_nr(12));

	}

}
