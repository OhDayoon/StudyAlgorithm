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
