package backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test1181 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] str = new String[n];
		
		sc.nextLine(); // 개행버림
		
		for(int i=0;i<n;i++) {
			str[i] = sc.nextLine();
		}
		
		
		Arrays.sort(str,new Comparator<String>() { // 문자열 비교
			public int compare(String s1,String s2) {
				if(s1.length()==s2.length()) { // 문자의 길이가 같다면
					return s1.compareTo(s2); // 문자를 서로 비교하고 사전적으로 빨리 나오는 것으로 오름차순
				}
				else {
					return s1.length()-s2.length(); // 길이로 비교, 값이 양수이면 순서 바뀜
				}
			}
		});
		
		System.out.println(str[0]);
		
		for(int i=1;i<n;i++) {
			if(!str[i].equals(str[i-1])) { // 중복되지 않는 값일 때만 출력
				System.out.println(str[i]);
			}
		}
		
		
		sc.close();

	}

}
