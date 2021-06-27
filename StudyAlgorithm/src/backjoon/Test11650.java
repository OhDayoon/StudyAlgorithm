package backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test11650 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i=0;i<n;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(arr,new Comparator<int[]>() {
			
			@Override
			public int compare(int[] a1,int[] a2) {
				if(a1[0]==a2[0]) {
					return a1[1]-a2[1];
				}
				else {
					return a1[0]-a2[0];
				}
			}
		});
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
