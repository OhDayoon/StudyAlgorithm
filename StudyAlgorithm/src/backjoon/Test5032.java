package backjoon;

import java.util.Scanner;

public class Test5032 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int e=sc.nextInt(); // 가지고 있는 빈병
		int f=sc.nextInt(); // 그 날 발견한 빈 병
		int c=sc.nextInt(); // 새병으로 바꾸는데 필요한 병
		
		int sum=e+f;
		int bot=0; // 현재 새병 
	
		while(sum>=c) { // 빈병의 합이 새 병보다 많을 때까지 반복
			int p=sum/c; 
			bot+=p; // 새병에 추가
			sum=p+(sum%c); // 빈병의 합: 새병+빈병에서 새병으로 바꾸는데 필요한 병의 나머지 병 수
		}
		sc.close();
		System.out.println(bot);
	}

}
