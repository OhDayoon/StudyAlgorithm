package backjoon;

import java.util.Scanner;

public class Test3460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int p = sc.nextInt();
			String str=Integer.toBinaryString(p); // 이진수로 치환할 때 쓰이는 방법, 뒤에서부터 값을 뽑아준다.
			System.out.println(str);
			for(int j=str.length()-1;j>=0;j--) { // 뒤집어서 구하기
				if(str.charAt(j)=='1') {
					System.out.print(str.length()-j-1+" "); // 뒤집힌 순서이기 때문에 str의 길이에서 j-1을 해주어야 한다.
				}
			}
		}
		sc.close();
	}

}
