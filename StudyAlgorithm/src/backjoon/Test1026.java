package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Test1026 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] brr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			brr[i]=sc.nextInt();
		}
		
		
		int sum=0;
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		for(int i=0;i<n;i++) {
			sum+=arr[i]*brr[n-i-1];
		}
		System.out.println(sum);
		sc.close();

	}

}
