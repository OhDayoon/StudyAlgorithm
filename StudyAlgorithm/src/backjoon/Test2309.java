package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Test2309 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] h = new int[9];
		int sum=0;
		boolean check=false;
		
		for(int i=0;i<9;i++) {
			h[i]=sc.nextInt();
			sum+=h[i];
		}
		
		for(int i=0;i<9;i++) {
			if(check) break;
			for(int j=0;j<9;j++) {
				if(i==j)continue;
				if(sum-h[i]-h[j]==100) {
					h[i]=0;
					h[j]=0;
					check=true;
					break;
				}
			}
		}
		Arrays.sort(h);
		
		for(int i=0;i<9;i++) {
			if(h[i]!=0) {
				System.out.println(h[i]);
			}
		}
		sc.close();
		
		
	}

}
