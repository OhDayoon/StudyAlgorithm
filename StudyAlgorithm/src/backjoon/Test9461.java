package backjoon;

import java.util.Scanner;

public class Test9461 {

	public static Long[] arr=new Long[101];
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		arr[0]=0L;
		arr[1]=1L;
		arr[2]=1L;
		arr[3]=1L;
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			System.out.println(fibo(n));
		}
		sc.close();
	}
	
	public static long fibo(int n) {
		if(arr[n]==null) {
			arr[n]=fibo(n-2)+fibo(n-3);
		}
		return arr[n];
	}

}
