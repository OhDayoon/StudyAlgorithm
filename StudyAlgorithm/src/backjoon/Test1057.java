package backjoon;

import java.util.Scanner;

public class Test1057 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		sc.close();
		int cnt=0;
		while(a!=b) { //a와 b가 일치할 때 while문을 벗어남
			a=(a+1)/2;
			b=(b+1)/2;
			cnt++;
		}
		System.out.println(cnt);
		// 만약 n=16일 때
		// (1 2) (3 4) (5 6) (7 8) (9 10) (11 12) (13 14) (15 16)
		// (1 3) (5 8) (9 11) (13 15)
		// (1 8) (9 13)
		// (8 9)
	}

}
