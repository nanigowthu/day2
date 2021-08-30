package que18;
import java.util.Scanner;
public class annauniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your number");
		int roll = sc.nextInt();
		System.out.println("Enter Your Name");
		String  name = sc.next();
		System.out.println("Enter Your Marks");
		int marks = sc.nextInt();
		
		if (marks==100)
		{
			System.out.println("Your Grade Is s");
		}
		else if (marks>=90 && marks<100)
		{
			System.out.println("Your Grade Is A");
		}
		else if (marks>=80 && marks<90)
		{
			System.out.println("Your Grade Is B");
		}
		else if (marks>=70 && marks<80)
		{
			System.out.println("Your Grade Is C");
		}
		else if (marks>=60 && marks<70)
		{
			System.out.println("Your Grade Is D");
		}
		else if (marks>=50 && marks<60)
		{
			System.out.println("Your Grade Is E");
		}
		else if (marks<=50 )
		{
			System.out.println("Your Grade Is F");
		}
		else if (marks>100 )
		{
			System.out.println("Your MArks Are Invaild");
		}
	}

}
