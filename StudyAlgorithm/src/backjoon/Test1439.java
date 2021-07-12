package backjoon;

import java.util.Scanner;

public class Test1439 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		String [] arr= s.split("");
		
		sc.close();
		
		int zero=0, one=0;
		
		// 0001100 이라면
		// 0과 1이 다른 지점을 나누어서 생각한다.
		// 000 / 11 / 000 세등분으로 나눌 수 있고
		// 그 중 연속된 11만 00으로 뒤집으면 같은 수로 만들 수 있다.
		
		if(arr[0].equals("0")) zero++;	
		else one++;

		for(int i=1;i<arr.length;i++) {
			// 옆에있는 수와 다를 때 현재 위치한 값이 0이면 0의 수가 증가하고 1이면 의 수가 증가한다.
			if(!arr[i-1].equals(arr[i])) {
				if(arr[i].equals("0")) {
					zero++;
				
				}
				else {
					one++;
				}
			}
		}
		System.out.println(Math.min(zero,one));
	
	}

}
