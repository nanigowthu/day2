package que4;
import java.util.Scanner;
public class circleintersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X,Y,Z,x,y,z;
		System.out.println("Enter The First X ");
		X = sc.nextInt();
		System.out.println("Enter The First Y ");
		Y = sc.nextInt();
		System.out.println("Enter The First Z ");
		Z = sc.nextInt();
		System.out.println("Enter The First x ");
		x = sc.nextInt();
		System.out.println("Enter The First y ");
		y = sc.nextInt();
		System.out.println("Enter The First z ");
		z = sc.nextInt();
		
		int rad = Z+z;
		double Fee = Math.pow(X-x, 2)+Math.pow(Y-y, 2);
		double  R  = Math.sqrt(Fee);
		
	if ( rad > R ) 
	{
		System.out.println("Circle Over Lap");
	}
	else if ( rad == R ) 
	{
		System.out.println("Circle Are Tangential ");
	}
	else if ( rad <= R) {
	    System.out.println("Circle Don't Over Lap")  ;
	}
	
	}



	}


