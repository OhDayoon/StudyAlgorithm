package backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test10814 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[][] member = new String[n][2];
		
		for(int i=0;i<n;i++) {
			member[i][0]= sc.next();
			member[i][1]=sc.next();
		}
		
		Arrays.sort(member,new Comparator<String[]>() {
			// // compare 메소드는  양의 정수, 0, 음의 정수 중 하나를 반환하며, 양의 정수일 경우만 두 객체의 위치를 바꿔주는 역할을 한다
			@Override
			public int compare(String[] a1,String[] a2) {	
					return Integer.parseInt(a1[0])-Integer.parseInt(a2[0]); 
			}
		
		});
		
		for(int i=0;i<n;i++) {
			System.out.println(member[i][0]+" "+member[i][1]);
		}
		sc.close();
	}
}
