package backjoon;

import java.util.Scanner;

public class Test2501 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int p=sc.nextInt();
		int q=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=p;i++) {
			if(p%i==0) {
				q--;
			}
			if(q==0) {
				System.out.println(i);
				break;
			}
		}
		if(q!=0) {
			System.out.println(0);
		}
		
	}
}
