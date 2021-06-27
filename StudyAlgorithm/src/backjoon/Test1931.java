package backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test1931 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 시작시간, 종료시간 입력할 수 있다.
		int[][] time = new int[n][2];
		
		for(int i=0;i<n;i++) {
			time[i][0]=sc.nextInt(); // 시작시간
			time[i][1]=sc.nextInt(); // 종료시간
		}
		
		// 종료시간에 맞게 오름차순으로 정렬
		Arrays.sort(time,new Comparator<int[]>() {

			@Override
			public int compare(int[] a1, int[] a2) {
				if(a1[1]==a2[1]) { // 만일 종료시간이 같다면
					return a1[0]-a2[0]; // 시작시간으로 비교
				}
				return a1[1]-a2[1]; // 종료시간으로 비교(음수와 양수로 비교하여 정렬, 양수가 나오면 순서 변경)
			}
			
		});
		sc.close();

		int cnt=0;
		int endtime=0;
		
		for(int i=0;i<n;i++) {
			if(endtime<=time[i][0]) { // 종료시간<=시작시간
				endtime=time[i][1]; // 종료시간으로 변경
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
