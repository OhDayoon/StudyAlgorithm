package backjoon;

import java.util.Scanner;

public class Test2530 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt(); // 시
		int b=sc.nextInt(); // 분
		int c=sc.nextInt(); // 초
		
		int d=sc.nextInt(); // 추가되는 시간
		
		sc.close();
		
		c+=d; // 우선 초끼리 더해준다
		b+=c/60; // 더해진 초에서 분을 알아온다. 
		c%=60; // 분을 정했다면 초는 60을 나눈 나머지값이 된다.
		a+=b/60; // 시는 분에서 60을 나누어 더해준다.
		b%=60; // 분에서 60을 나눈 나머지값으로 변경
		a%=24; // 0~23시로 표현
		System.out.println(a+" "+b+" "+c);
	}

}
