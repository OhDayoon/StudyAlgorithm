package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		int num=1;
		int count=0;
		
		for(int i=0;i<1000;i++) { //1000까지 배열을 담아준다.
			arr.add(num);
			count++;
			if(num==count) { // 1 2,2 3,3,3
				num++; // 값과 개수가 동일하면 값을 1증가
				count=0; // 개수는 초기화
			}
		}
		
		int a=sc.nextInt();
		int b=sc.nextInt();	
		int sum=0;
		
		for(int i=a-1;i<=b-1;i++) {
			sum+=arr.get(i); // 배열에서 a-1~b-1까지의 수 불러오기
		}
		System.out.println(sum);
		sc.close();
	}

}
