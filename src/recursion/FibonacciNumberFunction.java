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
	
	static int Fib(int n)
	{
		if (n<=0) //base case 1
			return 0;
		else if (n==0)//base case 2
			return 1;
		else
			return Fib(n-1) + Fib(n-2); //Recursive call
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fib(4));

	}

}
