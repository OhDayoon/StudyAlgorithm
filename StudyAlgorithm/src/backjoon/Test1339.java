package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Test1339 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		String[] arr=new String[n];
		int[] alpha=new int[26]; // 알파벳의 수
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		
		for(int i=0;i<n;i++) {
			int temp=(int)Math.pow(10, arr[i].length()-1); // 10의 제곱근
			for(int j=0;j<arr[i].length();j++) {
				alpha[(int)arr[i].charAt(j)-65]+=temp;
				temp/=10;
			}
		}

		Arrays.sort(alpha); // 26개의 배열을 오름차순
		int idx=9;
		int sum=0;
		for(int i=alpha.length-1;i>=0;i--) { // 내림차순으로 숫자 파악하기
			if(alpha[i]==0) {
				break;
			}
			sum+=alpha[i]*idx;
			idx--;
			
		}
		System.out.println(sum);
		sc.close();
	}

}
