package backjoon;

import java.util.Scanner;

public class Test2609 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int d=gcd(a,b);
		System.out.println(d); // 최대공약수
		System.out.println(a*b/d); // 최소 공배수
		sc.close();
	}
	
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}

}
