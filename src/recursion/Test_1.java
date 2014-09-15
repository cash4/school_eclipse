package recursion;

public class Test_1 {
	
	public static void xMethod(int n){
		if (n>0){
			xMethod(n-1);
			System.out.print(n + " ");
		}
	}
	
	public static void myMethod2(int counter){
		if (counter == 0)
			return;
			else {
				System.out.println("hello" + counter);
				myMethod2(--counter);
				System.out.println("" + counter);
				return;
			}
		
	}
	
	public static int countZeros(int[] a, int n){
		if (n==0){
			if (a[n] ==0){
				return 1;
			} else 
				return 0;
			}
		if (a[n]==0)
			return 1+ countZeros(a, n-1);
			else
				return 0+countZeros(a, n-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xMethod(5);
		myMethod2(3);
		
		int [] a = {0,3,10};
		
		
		
		
		System.out.println("How many zeros " + countZeros(a, 9));
	}

}
