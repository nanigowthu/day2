package que16;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter any Charcter");
		Scanner sc = new Scanner(System.in);
		
		ch = sc.next().charAt(0);
		
		if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		System.out.println("Vowel" +ch);
		} 
		else 
		{
		 System.out.println("Consontant");
		}
	
		}
	
	}


