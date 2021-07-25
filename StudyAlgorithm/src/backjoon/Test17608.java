package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class Test17608 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<n;i++) {
			stack.push(sc.nextInt());
		}
		
		int cnt=1;
		int max=stack.get(n-1);
		for(int i=n-2;i>=0;i--) {
			if(stack.get(i)>max) {
				cnt++;
				max=stack.get(i);
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
