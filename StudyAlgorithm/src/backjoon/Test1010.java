package backjoon;

import java.util.Scanner;
// 조합공식
public class Test1010 {
	public static int[][] dp=new int[31][31];;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
 
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			
			sb.append(combi(m,n)).append('\n');
		}
		sc.close();
		System.out.println(sb);
	}

	public static int combi(int n,int r) {
		if(dp[n][r]>0) {
			return dp[n][r];
		}
		if(n==r || r==0) {
			return dp[n][r]=1;
		}
		return combi(n-1,r-1)+combi(n-1,r);
	}
}
