package backjoon;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();	
		int cnt=0;
		for(int i=0;i<n;i++) {
			boolean flag=true;
			int t=sc.nextInt();
			
			if(t==1) {
				continue;
			}
			for(int j=2;j<t;j++) {
				if(t%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) cnt++;
		}
		System.out.println(cnt);
		sc.close();
	}
}
