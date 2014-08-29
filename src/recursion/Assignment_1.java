/**
 * 
 */
package recursion;

import javax.swing.plaf.synth.SynthInternalFrameUI;


/**
 * @author cash
 *
 */
public class Assignment_1 {
	
	
	
	//this method allows you to recursively check if a word is a palindrome
	public static boolean isPalindrome_r(String word){
		if (word.length()==0 || word.length()==1){
			return true;
		}
		if (word.charAt(0) == word.charAt(word.length()-1))
			return isPalindrome_r(word.substring(1, word.length()-1));
		return false;
		
	}
	
	public static boolean isPalindrome_nr(String word){
		boolean result = false;
		for (int i=1; i<= word.length();i++){
			if (word.charAt(i-1) == word.charAt(word.length()-i)){
				result = true;
			}
			else {
				result = false;
			}
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "";
		String s2 = "level";
		String s3 = "gohangasalamiimalasagnahog";
		String s4 = "almesla";
		System.out.println("Is " + s1 + " a palindrome? " + isPalindrome_r(s1));
		System.out.println("Is " + s2 + " a palindrome? " + isPalindrome_nr(s2));
		System.out.println("Is " + s3 + " a palindrome? " + isPalindrome_r(s3));
		System.out.println("Is " + s4 + " a palindrome? " + isPalindrome_nr(s4));

	}

}
