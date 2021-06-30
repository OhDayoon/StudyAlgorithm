package backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int num=1;
		int count=0;
		for(int i=0;i<=1000;i++) {
			arr.add(num);
			count++;
			
			if(num==count) {
				num++;
				count=0;
			}
		}
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		for(int i=a-1;i<=b-1;i++) {
			sum+=arr.get(i);
		}
		System.out.println(sum);
		sc.close();
	}
}
