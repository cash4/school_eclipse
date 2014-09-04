/**
 * 
 */
package recursion;



/**
 * @author cash
 *
 */
public class Assignment_1 {
	
	
	
	//this method recursively checks if a word is a palindrome
	public static boolean isPalindrome_r(String word){
		if (word.length()==0 || word.length()==1){
			return true;
		}
		if (word.charAt(0) == word.charAt(word.length()-1))
			return isPalindrome_r(word.substring(1, word.length()-1));
		return false;		
	}
	//this method non-recursively checks if a word is a palindrome
	public static boolean isPalindrome_nr(String word){
		boolean result = false;
		int i, begin, middle, end;
		begin = 0;
		end = word.length()-1;
		middle = (begin+end)/2;
		if (word.length()==0 || word.length()==1){
			System.out.println(word);
			result = true;
		}
				
		for (i = begin; i<= middle; i++){			
			if (word.charAt(begin)== word.charAt(end)){
				begin++;
				end--;
				}
				else {
					break;
				}			
			}
			if (i==middle+1){
				result = true;
			}
			else {
				result = false;
			}
		
		return result;
		

	}
	//this method recursively computes Sum(n)=1+1/2+1/3+...1/n
	public static double sum_r(double n){
		//double endNumber = 0;
		if (n == 1){
			return 1;
		}
		else {
			
			return 1/n + sum_r(n-1);
			
		}
		
	}
	//this method non-recursively computes Sum(n)=1+1/2+1/3+...+1/n
	public static double sum_nr(double n){
		double result = 0;
		for (int i=1; i<=n; i++){
			result = result + (double)1/i;
		}
		return result;
	}
	
	//this method allows you to recursively compute the greatest common divisor of two 
	//positive integer numbers
	public static double getGcd_r(int m, int n){
		if (m == 0 || n == 0){
			return m+n;
		}
		else {
			return getGcd_r(n, m%n);
		}
	}
	//this method allows you to non-recursively compute the greatest common divisor of two
	//positive integer numbers
	public static double getGcd_nr(int m, int n){
		int result = 0;
		while (m != 0 && n != 0){
			result = n;
			n = m%n;
			m = result;
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "level";
		String s2 = "radar";
		String s3 = "gohangasalamiimalasagnahog";
		String s4 = "alias";
		int i1 = 10000;
		int gcd1 = 1845729;
		int gcd2 = 9927189;
		System.out.println("Is " + s1 + " a palindrome? " + isPalindrome_r(s1));
		System.out.println("Is " + s2 + " a palindrome? " + isPalindrome_r(s2));
		System.out.println("Is " + s3 + " a palindrome? " + isPalindrome_r(s3));
		System.out.println("Is " + s4 + " a palindrome? " + isPalindrome_r(s4));
		System.out.println("Is " + s1 + " a palindrome? " + isPalindrome_nr(s1));
		System.out.println("Is " + s2 + " a palindrome? " + isPalindrome_nr(s2));
		System.out.println("Is " + s3 + " a palindrome? " + isPalindrome_nr(s3));
		System.out.println("Is " + s4 + " a palindrome? " + isPalindrome_nr(s4));
		
		System.out.println("Sum_r of " + i1 + " is " + sum_r(i1));
		System.out.println("Sum_nr of " + i1 + " is " + sum_nr(i1));
		
		System.out.println("GCD of " + gcd1 + " and " + gcd2 + " is: " + getGcd_r(gcd1, gcd2));
		System.out.println("GCD of " + gcd1 + " and " + gcd2 + " is: " + getGcd_nr(gcd1, gcd2));
	}

}
