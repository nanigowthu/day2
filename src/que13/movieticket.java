package que13;
import java.util.Scanner;
public class movieticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x ;
		double y ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The X");
		x = sc.nextInt();
		
		System.out.println("Enter The Y");
		y = sc.nextDouble();
		
		if (y == 13.30 && x>13 ) 
		{
			System.out.println("$5.00");
		}
		else if (y==13.30 && x<=13 ) {
			System.out.println("The Ticket Price is $2.00");
		}
		else if (x>13) {
			System.out.println("The Ticket Price is $8.00");
		}
		else {
			System.out.println("The Ticket Price is $4.00");
		}
	}

}
