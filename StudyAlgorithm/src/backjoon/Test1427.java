package backjoon;

import java.util.Scanner;

public class Test1427 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 2143 한꺼번에 입력해야함
		String n = sc.nextLine();
		
		int[] arr = new int[n.length()];
		for(int i=0;i<n.length();i++) {
			arr[i]=n.charAt(i)-'0'; // char로 하나씩 쪼개어 숫자 구하기
		}
		
		sc.close();
		
		for(int i=1;i<n.length();i++) {
			for(int j=0;j<n.length()-i;j++) {
				if(arr[j]<arr[j+1]) { // 내림차순 정렬
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		for(int val:arr) {
			System.out.print(val);
		}

	}

}
