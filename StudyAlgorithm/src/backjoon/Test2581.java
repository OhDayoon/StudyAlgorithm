package backjoon;

import java.util.Scanner;

public class Test2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		sc.close();
		int sum=0;
		int min=10000;
		for(int i=m;i<=n;i++) {
			boolean flag=true;
			if(m==0 || m==1) {
				continue;
			}
			for(int j=2;j<m;j++) {
				if(m%j==0) {
					flag=false;					
					break;
				}
			}
			
			if(flag) {
				sum+=m;
				min=Math.min(min, m);
			}
			m++;
		}
		if(sum==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
