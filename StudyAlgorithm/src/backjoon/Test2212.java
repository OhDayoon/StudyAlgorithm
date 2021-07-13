package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Test2212 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		if(k>=n) {
			System.out.println(0);
			return; //종료
		}
		
		int[] arr=new int[n];

		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr); // 오름차순 정렬
		int[] dif=new int[n-1]; // 차이를 담아 배열에 담아두기
		for(int i=0;i<n-1;i++) {
			dif[i]=arr[i+1]-arr[i];
		}
		
		Arrays.sort(dif);
		int sum=0;
		for(int i=0;i<n-k;i++) {
			sum+=dif[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
