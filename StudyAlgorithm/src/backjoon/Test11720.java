package backjoon;

import java.util.Scanner;

public class Test11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str  = sc.next(); // 숫자를 공백없이 입력해야함
		int sum=0;
		for(int i=0;i<n;i++) {
			int a = str.charAt(i)-'0'; // 숫자를 알아오기 위해 char타입인 숫자에서 '0'을 빼줘야 정확한 값이 도출
			sum+=a;
		}

		System.out.println(sum);
		sc.close();

	}

}
