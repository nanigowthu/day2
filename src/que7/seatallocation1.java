package que7;
import java.util.Scanner;
public class seatallocation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Of Rows");
		r = sc.nextInt();
		System.out.println("Enter The Number Of Columns");
		c = sc.nextInt();
		System.out.println("Enter The Number Of Student");
		s = sc.nextInt();
		
		
		if (s%c==0 || s%c==1 || s<=c)
		{
			System.out.println("Yes");
		}
			else {
				
				System.out.println("No");
		}
		
	}

}
