package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class Test3986 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int result=0;
		
		for(int i=0;i<n;i++) {
			Stack<Character> stack=new Stack<>();
			String str=sc.next();
			stack.push(str.charAt(0));
			for(int j=1;j<str.length();j++) {
				if(!stack.isEmpty()&&stack.peek()==str.charAt(j)) { //스택이 비어있지 않고 문자열이 한쌍(AA/BB)을 이루면
					stack.pop(); // 스택에서 비우기
				}
				else {
					stack.push(str.charAt(j)); // 스택담기
				}
				
			}
			if(stack.size()==0) result++; // 모두 한 쌍을 이루면(스택의 크기가 0일 때) 결과값 증가
		}
	
		System.out.println(result);
		sc.close();
	}

}
