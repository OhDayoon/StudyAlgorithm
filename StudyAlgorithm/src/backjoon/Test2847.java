package backjoon;

import java.util.Scanner;
// 그리디 탐색법
public class Test2847 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		// n은 4일 때, (2,3) (1,2) (0,1) 비교
		for(int i=n-2;i>=0;i--) {
				if(arr[i]>=arr[i+1]) {
					int diff=arr[i]-arr[i+1]+1; //i번째가 i+1번째 값보다 1 작게하기 위해서
					sum+=diff;// 감소된 값을 넣어준다.
					arr[i]-=diff;// 기존i번째 값에서 diff만큼 감소시킨다.
				}
		}
		System.out.println(sum);
		sc.close();
	}

}
