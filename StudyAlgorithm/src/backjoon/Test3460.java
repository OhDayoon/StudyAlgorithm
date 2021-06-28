package backjoon;

import java.util.Scanner;

public class Test3460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int p = sc.nextInt();
			String str=Integer.toBinaryString(p);
			System.out.println(str);
			for(int j=str.length()-1;j>=0;j--) {
				if(str.charAt(j)=='1') {
					System.out.print(str.length()-j-1+" ");
				}
			}
		}

	}

}
