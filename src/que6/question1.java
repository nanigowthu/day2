package que6;
import java.util.Scanner;
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Two Values");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a>b ) {
			System.out.println("A is grater than B");
		}
		else if ( a<b) {
			System.out.println("B is grater than A");
		}
		else if (a==b) {
			System.out.println("A is equal  A");
		}
	}

}
