/**
 * 
 */
package recursion;

/**
 * @author Corey
 *
 */
public class Sorting {

	/**
	 * @param args
	 */
	public static void sortArray(int[] arr, int start, int end)
	{
		if (start == end) return;
		//if not, do the otherwise part
		//step 1, find maximum value
		int tmpValue = arr[start];
		int tmpIndex = start;
		for (int i = start; i <= end; i++)
		{
			if (tmpValue <= arr[i])
			{
				tmpValue = arr[i];
				tmpIndex = i;
			}
		}
		//step 2, swap
		arr[tmpIndex] = arr[end];
		arr[end] = tmpValue;
		
		//step 3,
		sortArray(arr, start, end-1);
	}
	
	public static void sortArray_nr (int [] arr, int start, int end)
	{
		for (int i = end; i > start; i--)
		{
			int tmpValue = arr[start];
			int tmpIndex = start;
			for (int j = start; j <= i; j++)
			{
				if (tmpValue < arr[j])
				{
					tmpValue = arr[j];
					tmpIndex = j;
				}
			}
			arr[tmpIndex] = arr[i];
			arr[i] = tmpValue;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		a[0]= 33;
		a[1]= 55;
		a[2]= 0;
		a[3]= 65;
		a[4]= 2;
		a[5]= 1;
		a[6]= 400;
		a[7]= 89;
		a[8]= 25;
		a[9]= 66;
		
		int[] b = new int[10];
		b[0]= 3;
		b[1]= 4;
		b[2]= 0;
		b[3]= 5;
		b[4]= 2;
		b[5]= 1;
		b[6]= 8;
		b[7]= 9;
		b[8]= 7;
		b[9]= 6;
		
		sortArray(a, 0, 9);
		for (int i=0; i<10; i++)
			System.out.println(a[i]);
		
		sortArray_nr(b, 0, 9);
		for (int i=0; i<10; i++)
			System.out.println(b[i]);

	}

}
