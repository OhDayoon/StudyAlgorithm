package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Test9237 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		int[] r=new int[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	
		Arrays.sort(arr);
		
		// 내림차순 정렬로 변환
		for(int i=0;i<arr.length;i++) {
			r[i]=arr[n-i];
		}
		int day=r[0], result=1;
		
		// 기간을 확인하여 묘목일수의 기간이 다음 묘목의 기간 일수보다 작으면 그만큼 더해주어야 한다.
		for(int i=1;i<arr.length;i++) {
			result++;
			if(day<(result+r[i])) {
				day=day+(result+r[i]-day);
			}
			
		}
		System.out.println(day+1);
		sc.close();
	}
}
