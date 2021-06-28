package backjoon;

import java.util.Scanner;

public class Test1789 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 수의 범위를 잘 생각해보기
		long s = sc.nextLong();
		
		long sum=0;
		int a=0;
		int cnt=0;
		
		while(s>=sum) {
			a++;
			sum+=a;
			cnt++;
		}
		if(s>sum) {
			System.out.println(cnt);
		}
		else {
			System.out.println(cnt-1);
		}
		sc.close();
	}
}
