package backjoon;

import java.util.Scanner;

public class Test2490 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[4];
		int zero=0,one=1;
		String result="";
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr[j]=sc.nextInt();
			}
			for(int k=0;k<4;k++) {
				if(arr[k]==0) {
					zero++;
				}
				else {
					one++;
				}
			}
			
			if(zero==1) {
				result="A";
			}
			else if(zero==2) {
				result="B";
			}
			else if(zero==3) {
				result="C";
			}
			else if(zero==4) {
				result="D";
			}
			else {
				result="E";
			}
			System.out.println(result);
			zero=0;
		}
		
	}

}
