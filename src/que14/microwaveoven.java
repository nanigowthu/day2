package que14;
import java.util.Scanner;
public class microwaveoven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		float i,j,n,s,p,m ;
		i = sc.nextFloat();
		j = sc.nextFloat();
		
			
		s = i*j ;
		p = ((j/100)*50) ;
		m  = s-p ;
		if (i<=2) {
				System.out.println(""+m);
		}
		else if (i==3) {
			System.out.println(""+2*j);
		}
		else {
			System.out.println("Number Of Items Is More");
		}
	}

}
	


