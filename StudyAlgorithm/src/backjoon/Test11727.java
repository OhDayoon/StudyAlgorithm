package backjoon;

import java.util.Scanner;

public class Test11727 {
	public static int[] dp;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		dp=new int[n+1];
		System.out.println(topdown(n));
	}
	
	public static int topdown(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 3;
		}
		if(dp[n]>0) {
			return dp[n];
		}

		dp[n]=topdown(n-1)+(2*topdown(n-2));
		dp[n]%=10007;
		return dp[n];

	}
}
