package backjoon;

import java.util.Scanner;

public class Test1541 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum=Integer.MAX_VALUE;
		String[] sic=sc.nextLine().split("-");
		// 뺄샘으로 문자열을 분리
		
		// 분리된 문자열 배열을 반복
		for(int i=0;i<sic.length;i++) {
			int temp=0;
			
			// 덧셈으로 문자열 분리
			String[] add= sic[i].split("\\+");
			
			// 문자열을 서로 더해준다.
			for(int j=0;j<add.length;j++) {
				temp+=Integer.parseInt(add[j]);
			}
			
			// 첫번째수는 양수로
			if(sum==Integer.MAX_VALUE) {
				sum=temp;
			}
			else {
				sum-=temp;
			}
		}	
		sc.close();
		System.out.println(sum);
	}

}
