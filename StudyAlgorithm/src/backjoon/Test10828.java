package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class Test10828 {
	
	public static int[] stack;
	public static int size=0;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		stack=new int[n];
		
		//scanner 와 system.out.println()을 사용하면 시간초과가 됨
		// stack의 원리를 배열로 이용하여 푼다.
		
		for(int i=0;i<n;i++) {
			String str=sc.next();
			
			switch(str) {
				case "push":
					push(sc.nextInt());
					break;
				case "pop":
					sb.append(pop()).append('\n');
					break;
				case "empty":
					sb.append(empty()).append('\n');
					break;
				case "size":
					sb.append(size()).append('\n');
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
		else {
			return -1;
		}
		
	}

	private static int empty() {
		if(size==0) {
			return 1;
		}
		else {
			return 0;
		}
	}

	private static int size() {
		return size;
		
	}

	private static int pop() {
		if(size==0) {
			return -1;
		}
		else {
			int p=stack[size-1];
			stack[size-1]=0;
			size--; // 스택의 크기를 감소해주는 역할
			return p;
		}
	}

	private static void push(int num) {
		stack[size]=num;
		size++; // 스택의 크기를 증가해주는 역할
	}

}
