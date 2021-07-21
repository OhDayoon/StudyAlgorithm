package Programmers_Level2;

import java.util.Stack;

public class Test12 {
	// 올바른 괄호
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	boolean solution(String s) {
        boolean answer = false;
        Stack<Character> st=new Stack<>(); // char타입으로 새로운 스택 생성
        /*
        if(s.charAt(0)==')'){ // 만약 문자열 처음에 위치한 것이 ')'이라면 false 도출
            return false; // 아래 isEmpty() 를 사용하기 때문에 주석문 처리
        }
        */
        for(int i=0;i<s.length();i++){ // 문자열만큼 반복
            if(s.charAt(i)=='('){// '('으로 시작하면 스택에 '(' 문자 쌓기
                st.push('(');
            }
            else{
                if(st.isEmpty()){ // 비어있는데 ')'나오면 false 도출
                    return false;
                }
                else{
                    st.pop(); // '('이 존재한다면 '(' 문자 없애기
                }
            }
        }
        if(st.isEmpty()){ // 스택이 비어있다면 true 값 도출
            answer=true;
        }

        return answer;
    }
}
