package backjoon;

import java.util.Scanner;

public class Test2460 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int[][] arr = new int[10][2];
		int max=0;
		int sum=0;
		for(int i=0;i<10;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		
		for(int i=0;i<10;i++) {
			sum+=arr[i][1]-arr[i][0];
			max=Math.max(max, sum);
		}
		sc.close();
		System.out.println(max);
	}

}
