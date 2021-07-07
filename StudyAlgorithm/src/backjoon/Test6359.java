package backjoon;

import java.util.Scanner;

public class Test6359 {

	public static int[] arr;
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int s=0;s<t;s++) {
			int n=sc.nextInt();
			arr=new int[n+1];
			for(int i=1;i<=n;i++) {
				for(int j=1;i*j<=n;j++) {
					if(arr[i*j]!=0) {
						arr[i*j]=0;
					}
					else {
						arr[i*j]=1;
					}
				}
			}
			int result=0;
			for(int k=1;k<=n;k++) {
				result+=arr[k];
			}
			System.out.println(result);
		}
	
		sc.close();
	}
}
