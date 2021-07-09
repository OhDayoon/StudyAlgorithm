package backjoon;

import java.util.Scanner;

public class Test1924 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		// 배열에 해당 월의 일 수를 담아둔다
		int[] month= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		// 일 수의 합은 지난달까지의 합을 구한다.
		int sum=0;
		for(int i=1;i<=12;i++) {
			if(i==x) break;
			sum+=month[i];
		}
		
		// 더한 일수에 현재 알고싶은 일을 다시 더해준다.
		sum+=y;
		
		// 요일을 알기위해 7로 나눈 나머지값을 알아온다.
		int day=sum%7;
		
		switch (day) {
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		default:
			break;
		}

	}

}
