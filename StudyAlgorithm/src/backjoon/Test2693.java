package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Test2693 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		
		int[] input=new int[10]; // 10개의 수만 입력
		int[] result=new int[t]; // 뒤에서 세번째인 수만 배열에 담아주기
		
		for(int i=0;i<t;i++) {
			for(int j=0;j<10;j++) {
				input[j]=sc.nextInt();			
			}
			Arrays.sort(input);
			result[i]=input[7];
		}
		
		for(int i=0;i<t;i++) {
			System.out.println(result[i]);
		}
		sc.close();
	}
}
