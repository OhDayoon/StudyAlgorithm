package backjoon;

import java.util.Scanner;

public class Test2156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] dp=new int[n+1];
		int[] arr=new int[n+1];
		
		for(int i=1;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		
		dp[1]=arr[1];
		// 2잔일 때는 무조건 1번째 잔과 2번째 잔의 양을 합산
		if(n>1) dp[2]=arr[1]+arr[2];
		
		// 연속해서 3잔을 마실 수 없기 때문에 기준점이 된다.
		// 3번째 이상일 때 경우의 수는
		// xoo : arr[i]+arr[i-1]+dp[i-3]
		// oxo : arr[i]+dp[i-2]
		// oox : dp[i-1]
		// 이 경우의 수에서 최대값을 구해야한다
		for(int i=3;i<=n;i++) {
			dp[i]=Math.max(dp[i-1], Math.max(arr[i]+arr[i-1]+dp[i-3], arr[i]+dp[i-2]));
		}
		System.out.println(dp[n]);
		sc.close();
	}

}
