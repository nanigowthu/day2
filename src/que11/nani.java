package que11;
import java.util.Scanner;
public class nani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s,m,t,w,th,fr,sa ;
		int bonus,bonusr,r1,r2=0,r3=0,r4 = 0,r5=0,r6=0,r7,r8 = 0;
		int edays ,todays,total;
		 
		s = sc.nextInt();
		m = sc.nextInt();
		t = sc.nextInt();
		w = sc.nextInt();
		th = sc.nextInt();
		fr = sc.nextInt();
		sa = sc.nextInt();
		
		r1 = s*150 ;
		r7 = sa*125;
		if (m<=8) {
			r2 = m * 100 ;
		}
		else if (m>8) {
			bonus = m-8;
				bonusr = bonus*115;
			r2 = bonusr+800 ;
		}
		else if (t>8) {
			bonus = t-8;
			bonusr = bonus*115;
		r3 = bonusr+800 ;
		}
	if (w<=8) {
		r4 = w*100 ;
	}
	else if ( w>8) {
		bonus = w-8;
		bonusr = bonus*115;
	r4 = bonusr+800 ;
	}
	else if (th>8) {
		bonus = th-8;
		bonusr = bonus*115;
	r5 = bonusr+800 ;
	}
	if (fr<8) {
		r6 = fr*100 ;
		
	}
	else if (fr>8)
	{
		bonus = fr-8;
		bonusr = bonus*115;
	r6 = bonusr+800 ;
	}
	todays = m+t+w+th+fr ;
	if (todays >40) {
		edays = todays - 40 ;
		r8 =  edays*25 ;
		
	}
	total = r1 + r2 + r3 + r4 + r5 + r6 + r7+ r8 ;
	
	System.out.println("Total Rate "+ total );
	}

	}


