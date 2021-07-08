package backjoon;

import java.util.Scanner;

public class Test15894 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextLong();
		sc.close();
		long s=4;
		// 숫자의 범위를 잘 파악해야한다.
		if(a>1) {
			for(long i=2;i<=a;i++) {
				s=s-(i-1)+(i+3);
			}
		}
		System.out.println(s);
	}

}
