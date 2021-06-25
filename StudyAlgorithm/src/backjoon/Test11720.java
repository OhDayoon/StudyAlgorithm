package backjoon;

import java.util.Scanner;

public class Test11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str  = sc.next();
		int sum=0;
		for(int i=0;i<n;i++) {
			int a = str.charAt(i)-'0';
			sum+=a;
		}

		System.out.println(sum);
		sc.close();

	}

}
