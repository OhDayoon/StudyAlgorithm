package backjoon;

import java.util.Scanner;

public class Test2750 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] p = new int[n]; 
		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt(); // 숫자 배열 생성
		}
		
		int tmp=0;
	
		// bubble sort 방법 생각해보기
		
		for(int i=1;i<p.length;i++) {
			for(int j=0;j<(p.length-i);j++) { 
				if(p[j]>p[j+1]) { // 앞에 있는 숫자가 뒤에 나오는 숫자보다 크다면
					tmp=p[j];
					p[j]=p[j+1];
					p[j+1]=tmp;
				}
			}
			
		}
		for(int k=0;k<p.length;k++) {
			System.out.println(p[k]);
		}
		
		sc.close();

	}

}
