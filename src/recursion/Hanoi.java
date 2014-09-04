/**
 * 
 */
package recursion;

/**
 * @author Corey
 *
 */
public class Hanoi {

	/**
	 * @param args
	 */
	public static void Hanoi(int n, char from, char dest, char by)
	{
		if (n==1)
			System.out.println("Move a disk from " + from + " to " + dest);
		else
		{
			Hanoi(n-1,from,by,dest);
			Hanoi(1, from, dest, by);
			Hanoi(n-1, by, dest, from);
		}
	}
	
	public static void Hanoi_steps(int n, char from, char dest, char by, Step s)
	{
		if (n==1)
		{
			System.out.println("Move a disk from " + from + " to " + dest);
			s.increase();
		}
		else
		{
			Hanoi_steps(n-1,from,by,dest, s);
			Hanoi_steps(1, from, dest, by, s);
			Hanoi_steps(n-1, by, dest, from, s);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hanoiNum = 25;
		Hanoi(hanoiNum, 'A', 'B', 'C');
		
		Step s = new Step();
		Hanoi_steps(hanoiNum, 'A', 'B', 'C', s);
		System.out.println("It takes " + s.getTimes() + " steps to move " + hanoiNum + " disks");

	}

}
