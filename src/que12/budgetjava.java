package que12;
import java.util.Scanner;
public class budgetjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B,C,D,E;
		int sum = 0;
		
		A = sc.nextInt();
		
		B = sc.nextInt();
		
		C  = sc.nextInt();
		
		D  = sc.nextInt();
		
		E  = sc.nextInt();
		
		sum = A+B+C+D+E ;
				
	
		
		
		if (sum <= 1500)
		{
			System.out.println("YES ");
		}
		else if ( sum > 1500)
		{
			System.out.println("NO ");
		}
	}

}
