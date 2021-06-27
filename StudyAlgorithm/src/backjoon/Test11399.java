package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Test11399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
		int sum=0, prev=0;
		Arrays.sort(arr); // 오름차순 정렬
		
		for(int i=0;i<arr.length;i++) {
			sum+=prev+arr[i];
			prev+=arr[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
