package que19;
import java.util.Scanner;
public class laballocation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x,y,z ;
	    String lab ;
	    System.out.println("Enter The X");
	    x = sc.nextInt();
	    System.out.println("Enter The Y");
	    y = sc.nextInt();
	    System.out.println("Enter The Z");
	    z = sc.nextInt();	
	    
	    lab = sc.next();
	    
	    if (lab.equals("L1 ")) {
	    	if (y<z) {
	    	System.out.println("L2");
	    	}
	    else {
	    	System.out.println("L3");	
	    	}
	}
	    else if (lab.equals("L2")) {
	    	if (x<z) {
	    		System.out.println("L1");
	    	}
	    		else {
	    			System.out.println("L3");
	    		}
	    	}
	    else if (lab.equals("L3")) {
	    	if (x<y) {
	    		System.out.println("L1");
	    	}
	    		else {
	    			System.out.println("L2");
	    		}
	    	}
	}

}
