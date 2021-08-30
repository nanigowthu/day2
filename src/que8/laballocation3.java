package que8;
import java.util.Scanner;
public class laballocation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z,n,a,b,c ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The X value ");
		x = sc.nextInt();
		System.out.println("Enter The Y value ");
		y = sc.nextInt();
		System.out.println("Enter The Z value ");
		z = sc.nextInt();	
		System.out.println("Enter The N value ");
		n = sc.nextInt();
		
		a = x-n;
		b = y-n;
		c = z-n;
		
		if (a<0 && b<0 && c<0) 
		{
			System.out.println("None of these is can be allocated");
		}
			else if (a<b && a<c ) {
				System.out.println("L1 should be allocated");
				}
				else if (b<a && b<c ) {
					System.out.println("L2 should be allocated");
					}
				else  {
					System.out.println("L3 should be allocated");
				}
		}
		
				
		
	}

