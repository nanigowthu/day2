package que5;
import java.util.Scanner;
public class laballocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X ");
		x = sc.nextInt();
		System.out.println("Enter Y ");
		y = sc.nextInt();
		System.out.println("Enter Z ");
		z = sc.nextInt();

		if (y<z && z>x) {
			System.out.println("L1 Has Minimal Seating");
		}
		else if (y<x && y<x)
			System.out.println("L2 Has Minimal Seating"); 
		else if (z<x && x<y)
			System.out.println("L3 Has Minimal Seating"); 
		{
			
		}
		
 }
	   


	}


