package backjoon;

import java.util.Scanner;

public class Test10870 {
	// 피보나치 함수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		int b=fibo(a);
		System.out.println(b);
		sc.close();
	}
	
	public static int fibo(int a) {
		if(a==0) {
			return 0;
		}
		if(a==1) {
			return 1;
		}
		return fibo(a-1)+fibo(a-2);
	}
}
