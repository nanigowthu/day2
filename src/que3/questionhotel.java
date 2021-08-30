package que3;
import java.util.Scanner;
public class questionhotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,d = 0;
		float r,total;
		System.out.println("Enter The Room Number");
		m = sc.nextInt();
		System.out.println("Enter The  Rent Of The Room");
		r = sc.nextInt();
		System.out.println("How Many Day ");
		d = sc.nextInt();
		
		
	switch (m)
	{
	case 1: System.out.println("jan1");
	case 2: System.out.println("feb2");
	case 3: System.out.println("Mar3");
	total= r*d ;
	System.out.printf("Hotel Traiff Rs.%.2f" , total);break;
	
	case 4: System.out.println("Apr4");
	case 5: System.out.println("May5");
	case 6: System.out.println("jun6");
	total = r*d ;
	total+= 0.2*total ;
	System.out.printf("Hotel Traiff Rs.%.2f" , total);break;
	
	case 7: System.out.println("junly7");
	case 8: System.out.println("Aug8");
	case 9: System.out.println("Sep9");
	case 10: System.out.println("Oct10");
	total= r*d ;
	System.out.printf("Hotel Traiff Rs.%.2f" , total);break;
	
	
	case 11: System.out.println("Nov11");
	case 12: System.out.println("Dec12");
	total = r*d ;
	total+= 0.2*total ;
	System.out.printf("Hotel Traiff Rs.%.2f" , total);break;
	
	default : System.out.println("Invalied Input");
	}
		
	
	}



	}


