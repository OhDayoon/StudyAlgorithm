package backjoon;

import java.util.Scanner;
// 다이나믹 프로그래밍
public class Test11052 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] dp= new int[n+1];
		int[] arr= new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		// n개의 카드를 구매하기 위해 지불하는 금액 최댓값
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				// 만약 4장을 산다면
				// (1,1,1,1), (2,2), (1,3) ... 등등 방법이 여러가지이다.
				dp[i]=Math.max(dp[i], dp[i-j]+arr[j]);
			}
		}
		sc.close();
		System.out.println(dp[n]);
	}
}
