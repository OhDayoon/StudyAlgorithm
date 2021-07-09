package backjoon;

import java.util.Scanner;

public class Test2908 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String a=sc.next();
		String b=sc.next();
		sc.close();
		String ra="";
		String rb="";
		for(int i=a.length()-1;i>=0;i--) {
			ra+=a.charAt(i);		
		}
		
		for(int i=b.length()-1;i>=0;i--) {
			rb+=b.charAt(i);
		}

		if(Integer.parseInt(ra)>Integer.parseInt(rb)) {
			System.out.println(ra);
		}
		else {
			System.out.println(rb);
		}
	}

}
