package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class Test10828 {
	// 스택을 배열로 이용하여 풀기
	
	public static int[] stack;
	public static int size=0;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		stack=new int[n];
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<n;i++) {
			String str=sc.next();
			
			switch(str) {
				case "push":
					push(sc.nextInt());
					break;
				case "pop":
					sb.append(pop()).append('\n');
					break;
				case "size":
					sb.append(size()).append('\n');
					break;
				case "empty":
					sb.append(empty()).append('\n');
					break;
				case "top":
					sb.append(top()).append('\n');
					break;
					
			}
		}
		System.out.println(sb.toString());
		sc.close();
	}

	private static int top() {
		if(size>0) {
			return stack[size-1];
		}
		else return -1;
	}

	private static int empty() {
		if(size==0) {
			return 1;
		}
		else return 0;
	}

	private static int size() {
		return size;
	}

	private static int pop() {
		if(size>0) {
			int p=stack[size-1];
			size--;
			return p;
		}
		else {
			return -1;
		}
	}

	private static void push(int n) {
		stack[size]=n;
		size++;
	}

	

}
