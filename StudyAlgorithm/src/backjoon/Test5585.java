package backjoon;

import java.util.Scanner;

public class Test5585 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int coin = sc.nextInt();
		
		int sum=1000-coin;
		int cnt=0;		
		while(sum>0) {
			if(sum>=500) {
				sum-=500;
				cnt++;
			}
			else if(sum>=100) {
				sum-=100;
				cnt++;
			}
			else if(sum>=50) {
				sum-=50;
				cnt++;
			}
			else if(sum>=10) {
				sum-=10;
				cnt++;
			}
			else if(sum>=5) {
				sum-=5;
				cnt++;
			}
			else if(sum>=1) {
				sum-=1;
				cnt++;
			}
		}
		sc.close();
		
		System.out.println(cnt);
	}
}
