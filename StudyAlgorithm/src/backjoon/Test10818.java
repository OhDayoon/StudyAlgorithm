package backjoon;

import java.util.Scanner;

public class Test10818 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max=-1000000;
		int min=1000000;
	
		//	int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			int a=sc.nextInt(); // 이 방법이 아닌 배열로 풀어도 가능하다.
		// arr[i]=sc.nextInt();	
			max=Math.max(a, max);
			min=Math.min(a, min);
		}
		System.out.println(min+" "+max);
		sc.close();
	}

}
