package que2;
import java.util.Scanner;
public class questionfeecollection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t,h,N = 0 ;
	
		System.out.println("Enter Student Type");

		System.out.println("Enter The Value Of Tution Fee");
		t = sc.nextInt();
		System.out.println("Enter The Value Of Hostel Fee");
		h = sc.nextInt();
		
		
		switch ( N) 
	
		{
		case 1: System.out.println("MSDS");
		double fee , fee1;
		fee = t+h ;
		System.out.println(fee);
		break;
		
		case 2: System.out.println("MSH");
		fee = t+h ;
		System.out.println(fee);
		break;
		
		case 3: System.out.println("MGSDS");
		fee1 = ((1.5*t)+h) ;
		System.out.println(fee1);
		break;
		case 4: System.out.println("MGSH");
		fee1 = ((1.5*t)+h) ;
		System.out.println(fee1);
		break;
		

		}
		
		

	}

	


	}

