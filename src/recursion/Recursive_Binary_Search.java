package recursion;

public class Recursive_Binary_Search {
	
	public static int binarySearch (int [] arr, int start, int end , int key)
	{
		if (end < start)
			return -1;
		int mid = (start + end)/2;
		if (key == arr[mid])
			return mid;
		else if (key < arr[mid])
			return binarySearch(arr, start, mid-1, key);
		else
			return binarySearch(arr, mid+1, end, key);
	}

	public static void main(String[] args) {
		int[] a = {0,4,7,8,9,13,14};
		// TODO Auto-generated method stub
		
		System.out.println("the alksdfj " + binarySearch(a, 0, a.length, 13));
		System.out.println("the alksdfj " + binarySearch(a, 0, a.length, 9));
		
	}

}
