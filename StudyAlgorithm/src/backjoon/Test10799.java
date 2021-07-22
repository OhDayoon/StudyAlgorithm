package backjoon;

import java.util.*;

public class Test10799 {
	// 붙어있는 괄호() 이면 레이저
	// 떨어져있는 괄호( ) 이면 쇠막대기
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> st=new Stack<>();
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				st.push('(');
			}
			else {
				if(s.charAt(i-1)=='(') { // 앞에가 레이저인지 확인
					st.pop(); //')'로 레이저를 쐈을 때 나눠지는 경우
					cnt+=st.size(); //현재까지 레이저로 나눈 막대기 수
				}
				else { // 레이저가 아니라면, 막대기 시작
					st.pop();
					cnt++;
				}
				
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
