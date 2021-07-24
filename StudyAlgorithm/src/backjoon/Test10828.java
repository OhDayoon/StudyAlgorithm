package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class Test10828 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		StringBuilder sb=new StringBuilder(); 
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<n;i++) {
			String str=sc.next();
			
			switch(str) {
				case "push":
					st.push(sc.nextInt());
					break;
				case "pop":
					sb.append(pop().append('\n'));
					break;
				case "empty":
					break;
				case "size":
					break;
				case "top":
					break;
			}
		}

	}

	public static pop() {
		// TODO Auto-generated method stub
		return null;
	}

}
