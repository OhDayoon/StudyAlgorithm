package backjoon;

import java.util.Scanner;

public class Test1978 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt=0;
		
		for(int i=0;i<n;i++) {
			boolean flag = true;
			int a = sc.nextInt();
			if(a==1) {
				continue; // 1은 소수가 아니기 때문에
			}
			for(int j=2;j<a;j++) {
				if(a%j==0) {
					flag = false;
					break; // 나머지가 없다면 소수가 아니기 때문에 break를 사용해서 벗어난다.
				}
			}
			if(flag) { // 참일 때(소수일 때만 증가시켜줘야한다.)
				cnt++; // 개수 증가
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
